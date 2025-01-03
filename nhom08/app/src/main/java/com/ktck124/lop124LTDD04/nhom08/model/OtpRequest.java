package com.ktck124.lop124LTDD04.nhom08.model;

public class OtpRequest {
    private String phoneNumber;
    private String otpCode;

    public OtpRequest(String phoneNumber, String otpCode) {
        this.phoneNumber = phoneNumber;
        this.otpCode = otpCode;
    }
    public OtpRequest(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "OtpRequest{phoneNumber='" + phoneNumber + "'}";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOtpCode() {
        return otpCode;
    }
}
