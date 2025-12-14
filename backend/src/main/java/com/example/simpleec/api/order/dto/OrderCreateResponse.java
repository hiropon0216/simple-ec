package com.example.simpleec.api.order.dto;

public class OrderCreateResponse {

    private Long orderId;
    private int totalPrice;

    public OrderCreateResponse(Long orderId, int totalPrice) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
