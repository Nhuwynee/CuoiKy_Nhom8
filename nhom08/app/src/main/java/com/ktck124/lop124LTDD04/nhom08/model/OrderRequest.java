package com.ktck124.lop124LTDD04.nhom08.model;

import java.util.List;

public class OrderRequest {
    private int IdUser;

    private double pointOfOrder;
   // private List<Orderitem> orderDetails;
    private  int point;

    public OrderRequest(int IdUser, double orderCost, List<Orderitem> orderDetails, int point) {
        this.IdUser = IdUser;
//        this.orderCost = orderCost;
//        this.orderDetails = orderDetails;
        this.point = point;
    }

    public static class Orderitem {
        private int idBook;
        private int number;

        public Orderitem(int idBook, int number) {
            this.idBook = idBook;
            this.number = number;
        }
    }
}
