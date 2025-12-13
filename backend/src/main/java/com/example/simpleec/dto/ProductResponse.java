package com.example.simpleec.dto;

public record ProductResponse(
    Long id,
    String name,
    int price
) {}
