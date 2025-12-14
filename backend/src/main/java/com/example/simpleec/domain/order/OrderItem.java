package com.example.simpleec.domain.order;

import com.example.simpleec.domain.product.Product;
import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private int quantity;

    protected OrderItem() {}

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    void setOrder(Order order) {
        this.order = order;
    }

    public int getSubtotal() {
        return product.getPrice() * quantity;
    }
}
