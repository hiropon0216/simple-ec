package com.example.simpleec.api.order.dto;

import jakarta.validation.constraints.Min;

public class OrderItemRequest {

    private Long productId;

    @Min(1)
    private int quantity;

    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
