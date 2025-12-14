package com.example.simpleec.api.order;

import com.example.simpleec.api.order.dto.OrderCreateRequest;
import com.example.simpleec.api.order.dto.OrderCreateResponse;
import com.example.simpleec.api.order.dto.OrderResponse;
import com.example.simpleec.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // 注文作成
    @PostMapping
    public OrderCreateResponse create(
        @RequestBody @Valid OrderCreateRequest request
    ) {
        return orderService.create(request);
    }

    // ★ 注文一覧取得（追加）
    @GetMapping
    public List<OrderResponse> list() {
        return orderService.findAll();
    }
}
