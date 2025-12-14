package com.example.simpleec.api.product.dto;

public record ProductResponse(
    Long id,
    String name,
    int price
) {}
