package com.example.simpleec.service;

import com.example.simpleec.api.order.dto.OrderCreateRequest;
import com.example.simpleec.api.order.dto.OrderCreateResponse;
import com.example.simpleec.domain.order.Order;
import com.example.simpleec.domain.order.OrderItem;
import com.example.simpleec.domain.order.OrderRepository;
import com.example.simpleec.domain.product.Product;
import com.example.simpleec.domain.product.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
public class OrderService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public OrderService(
        ProductRepository productRepository,
        OrderRepository orderRepository
    ) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public OrderCreateResponse create(OrderCreateRequest request) {

        Order order = new Order(LocalDateTime.now());

        int totalPrice = 0;

        for (var item : request.getItems()) {
            Product product = productRepository.findById(item.getProductId())
                .orElseThrow(() -> new IllegalArgumentException("商品が存在しません"));

            OrderItem orderItem =
                new OrderItem(product, item.getQuantity());

            order.addItem(orderItem);
            totalPrice += orderItem.getSubtotal();
        }

        Order saved = orderRepository.save(order);

        return new OrderCreateResponse(saved.getId(), totalPrice);
    }

    public List<OrderResponse> findAll() {
    return orderRepository.findAll().stream()
        .map(OrderResponse::from)
        .toList();
}

}
