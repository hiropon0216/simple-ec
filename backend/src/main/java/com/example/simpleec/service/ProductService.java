package com.example.simpleec.service;

import com.example.simpleec.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<ProductResponse> findAll() {
        return List.of(
            new ProductResponse(1L, "Sample Product A", 1200),
            new ProductResponse(2L, "Sample Product B", 1800)
        );
    }
}
