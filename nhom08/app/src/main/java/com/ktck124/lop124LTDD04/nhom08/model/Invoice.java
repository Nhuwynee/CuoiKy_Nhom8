package com.ktck124.lop124LTDD04.nhom08.model;

import java.util.Date;

public class Invoice {
    private String orderNumber;
    private Date orderDate;
    private int orderPrice;
    private String orderStatus;
    private String avatarImage;
    private String statusIcon;

    // Constructor, getters và setters
    public Invoice(String orderNumber, Date orderDate, int orderPrice, String orderStatus, String avatarImage, String statusIcon) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.avatarImage = avatarImage;
        this.statusIcon = statusIcon;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getAvatarImage() {
        return avatarImage;
    }

    public String getStatusIcon() {
        return statusIcon;
    }


    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setAvatarImage(String avatarImage) {
        this.avatarImage = avatarImage;
    }

    public void setStatusIcon(String statusIcon) {
        this.statusIcon = statusIcon;
    }
}
