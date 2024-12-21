package com.ktck124.lop124LTDD04.nhom08.model;


public class NewPassRequest {
    private String phone;
    private String newPassword;

    public NewPassRequest(String phone, String newPassword) {
        this.phone = phone;
        this.newPassword = newPassword;
    }

    // Getter và Setter
    public String getPhone() {
        return phone;
    }


    public String getNewPassword() {
        return newPassword;
    }
}