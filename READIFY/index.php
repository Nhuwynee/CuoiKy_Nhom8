<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='./assets/img/iconlogo.jpg' rel='icon' type='image/x-icon' />
    <link rel="stylesheet" href="assets/css/admin.css">
    <link rel="stylesheet" href="./assets/css/toast-message.css">
    <link href="./assets/font/font-awesome-pro-v6-6.2.0/css/all.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="./assets/css/admin-responsive.css">
    <title>Quản lý cửa hàng</title>
    <style>
        body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
}

.content {
    background: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    width: 100%;
    max-width: 1200px;
}
    .sidebar {
    position: fixed;
    top: 0;
    left: 0;
    height: 100vh;
    width: 250px; /* Chiều rộng sidebar */
    background-color: #fff;
    color: #fff;
    padding: 20px;
    box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
    z-index: 1000; /* Đảm bảo sidebar luôn nằm trên */
}
.content{
    margin-left: 260px; /* Đẩy nội dung sang phải, ngang với chiều rộng sidebar */
    padding: 30px;
    background: #fff;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    max-width: 1200px;
}
    </style>
</head>

<body>
    <header class="header">
        <button class="menu-icon-btn">
            <div class="menu-icon">
                <i class="fa-regular fa-bars"></i>
            </div>
        </button>
    </header>
    <div class="container">
        <aside class="sidebar open">
            <div class="top-sidebar">
            <a href="#" class="channel-logo"><img src="./assets/img/login.png" alt="Channel Logo" style="width: 150px; height: auto;"></a>

            </div>
            <div class="middle-sidebar">
                <ul class="sidebar-list">
                    <li class="sidebar-list-item tab-content">
                        <a href="index.php" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-light fa-house"></i></div>
                            <div class="hidden-sidebar">Trang tổng quan</div>
                        </a>
                    </li>
                    <li class="sidebar-list-item tab-content ">
                        <a href="products.php" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-light fa-pot-food"></i></div>
                            <div class="hidden-sidebar">Sản phẩm</div>
                        </a>
                    </li>
                    <li class="sidebar-list-item tab-content active">
                        <a href="users.php" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-light fa-users"></i></div>
                            <div class="hidden-sidebar">Khách hàng</div>
                        </a>
                    </li>
                    <li class="sidebar-list-item tab-content">
                        <a href="orders.php" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-light fa-basket-shopping"></i></div>
                            <div class="hidden-sidebar">Đơn hàng</div>
                        </a>
                    </li>
                    <li class="sidebar-list-item tab-content">
                        <a href="total.php" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-light fa-chart-simple"></i></div>
                            <div class="hidden-sidebar">Thống kê</div>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="bottom-sidebar">
                <ul class="sidebar-list">
                    <li class="sidebar-list-item user-logout">
                        <a href="./index.php" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-thin fa-circle-chevron-left"></i></div>
                            <div class="hidden-sidebar">Trang chủ</div>
                        </a>
                    </li>
                    <li class="sidebar-list-item user-logout">
                        <a href="#" class="sidebar-link">
                            <div class="sidebar-icon"><i class="fa-light fa-circle-user"></i></div>
                            <div class="hidden-sidebar" id="name-acc"></div>
                        </a>
                    </li>
                    <li class="sidebar-list-item user-logout">
                        <a href="./index.php" class="sidebar-link" id="logout-acc">
                            <div class="sidebar-icon"><i class="fa-light fa-arrow-right-from-bracket"></i></div>
                            <div class="hidden-sidebar">Đăng xuất</div>
                        </a>
                    </li>
                </ul>
            </div>
        </aside>
        <main class="content">
            <div class="section active">
                <h1 class="page-title">Trang tổng quát của cửa hàng Book Shop</h1>
                <div class="cards">
                    <div class="card-single">
                        <div class="box">
                        <?php
                            include "connect.php"; 
                            $sql = "SELECT COUNT(*) AS total FROM Users";
                            $query = mysqli_query($conn, $sql);
                            $result = mysqli_fetch_assoc($query);
                            $total_users = $result['total'];
                            ?>

                            <h2 id="amount-user"><?php echo $total_users; ?></h2>
                            <div class="on-box">
                                <img src="assets/img/admin/s1.png" alt="" style=" width: 200px;">
                                <h3>Khách hàng</h3>
                                <p>Sản phẩm là bất cứ cái gì có thể đưa vào thị trường để tạo sự chú ý, mua sắm, sử dụng
                                    hay tiêu dùng nhằm thỏa mãn một nhu cầu hay ước muốn. Nó có thể là những vật thể,
                                    dịch vụ, con người, địa điểm, tổ chức hoặc một ý tưởng.</p>
                            </div>

                        </div>
                    </div>
                    <div class="card-single">
                        <div class="box">
                            <div class="on-box">
                                <img src="assets/img/admin/s2.png" alt="" style=" width: 200px;">
                                <?php
                                include "connect.php"; 
                                $sql = "SELECT COUNT(*) AS total FROM Book";
                                $query = mysqli_query($conn, $sql);
                                $result = mysqli_fetch_assoc($query);
                                $total_books = $result['total'];
                                ?>

                                <h2 id="amount-book"><?php echo $total_books; ?></h2>

                                <h3>Sản phẩm</h3>
                                <p>Khách hàng mục tiêu là một nhóm đối tượng khách hàng trong phân khúc thị trường mục
                                    tiêu mà doanh nghiệp bạn đang hướng tới. </p>
                            </div>
                        </div>
                    </div>
                    <div class="card-single">
                        <div class="box">
                        <?php
                                include "connect.php"; 
                                $sql = "SELECT 
                                            SUM(book.price * orderitem.number - orders.pointOfOrder) AS total_order_value
                                        FROM 
                                            orderitem
                                        JOIN 
                                            book ON orderitem.idBook = book.idBook
                                        JOIN 
                                            orders ON orderitem.idOrder = orders.IdOrder
                                        ";
                                $query = mysqli_query($conn, $sql);
                                $result = mysqli_fetch_assoc($query);
                                $total_books = $result['total_order_value'];
                                ?>
                            <h2 id="doanh-thu"><?php echo isset($total_books) ? number_format($total_books, 0, ',', '.') . ' VND' : '0 VND';?></h2>
                            <div class="on-box">
                                <img src="assets/img/admin/s3.png" alt="" style=" width: 200px;">
                                <h3>Doanh thu</h3>
                                <p>Doanh thu của doanh nghiệp là toàn bộ số tiền sẽ thu được do tiêu thụ sản phẩm, cung
                                    cấp dịch vụ với sản lượng.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
</body>
</html>