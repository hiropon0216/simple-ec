package com.example.simpleec.api.order.dto;

import com.example.simpleec.domain.order.Order;

import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(
    Long id,
    LocalDateTime createdAt,
    List<Item> items
) {
    public static OrderResponse from(Order order) {
        return new OrderResponse(
            order.getId(),
            order.getCreatedAt(),
            order.getItems().stream()
                .map(i -> new Item(i.getProductId(), i.getQuantity()))
                .toList()
        );
    }

    public record Item(
        Long productId,
        int quantity
    ) {}
}
