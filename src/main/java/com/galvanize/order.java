package com.galvanize;

public class Order {
    private String orderNumber;
    private String name;
    private LOCALDATETIME createdDate;

    //your code goes here, do not change any existing code


    public Order(String orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
        this.createdDate = LOCALDATETIME.NOW();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public LOCALDATETIME getCreatedDate() {
        return createdDate;
    }
}