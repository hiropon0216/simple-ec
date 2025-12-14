package com.example.simpleec.api.order.dto;

import jakarta.validation.constraints.NotEmpty;
import java.util.List;

public class OrderCreateRequest {

    @NotEmpty
    private List<OrderItemRequest> items;

    public List<OrderItemRequest> getItems() {
        return items;
    }
}
