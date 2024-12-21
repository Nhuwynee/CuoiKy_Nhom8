<?php
require 'connect.php'; // Kết nối DB

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $data = json_decode(file_get_contents("php://input"), true);

    $phone = $data['phone'];
    $otp = $data['otp'];
    $newPassword = password_hash($data['newPassword'], PASSWORD_BCRYPT);

    if (!empty($phone) && !empty($otp) && !empty($newPassword)) {
        // Kiểm tra OTP
        $stmt = $conn->prepare("SELECT otp FROM users WHERE phone = ?");
        $stmt->bind_param("s", $phone);
        $stmt->execute();
        $stmt->bind_result($dbOtp);
        $stmt->fetch();
        $stmt->close();

        if ($dbOtp == $otp) {
            // Cập nhật mật khẩu
            $stmt = $conn->prepare("UPDATE users SET password = ? WHERE phone = ?");
            $stmt->bind_param("ss", $newPassword, $phone);
            if ($stmt->execute()) {
                echo json_encode(["message" => "Mật khẩu đã được cập nhật."]);
            } else {
                echo json_encode(["error" => "Cập nhật mật khẩu thất bại."]);
            }
            $stmt->close();
        } else {
            echo json_encode(["error" => "OTP không chính xác."]);
        }
    } else {
        echo json_encode(["error" => "Dữ liệu không hợp lệ."]);
    }
}
?>
