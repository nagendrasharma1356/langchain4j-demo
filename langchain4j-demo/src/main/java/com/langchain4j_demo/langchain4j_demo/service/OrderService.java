package com.langchain4j_demo.langchain4j_demo.service;

import com.langchain4j_demo.langchain4j_demo.model.OrderEntity;
import org.springframework.stereotype.Service;
import com.langchain4j_demo.langchain4j_demo.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderEntity getOrderStatus(String orderId) {

        return orderRepository.findByOrderId(orderId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Order not found: " + orderId
                        )
                );
    }

    public OrderEntity cancelOrder(String orderId) {
        OrderEntity order = orderRepository.findByOrderId(orderId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Order not found: " + orderId
                        )
                );
        if (order.getStatus().equalsIgnoreCase("Shipped")) {
            throw new RuntimeException("Cannot cancel an order that has already been shipped.");
        }
        order.setStatus("CANCELLED");
        order.setExpectedDelivery(null);
        return orderRepository.save(order);
    }
}
