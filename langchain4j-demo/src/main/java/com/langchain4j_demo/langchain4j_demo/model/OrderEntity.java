package com.langchain4j_demo.langchain4j_demo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id", unique = true, nullable = false)
    private String orderId;

    private String customerName;

    private String productName;

    private String status;

    private String currentLocation;

    private LocalDate expectedDelivery;

    private BigDecimal totalAmount;

    private String paymentStatus;

    public Long getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public LocalDate getExpectedDelivery() {
        return expectedDelivery;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setExpectedDelivery(LocalDate expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", status='" + status + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", expectedDelivery=" + expectedDelivery +
                ", totalAmount=" + totalAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public OrderEntity(Long id, String orderId, String customerName, String productName, String status, String currentLocation, LocalDate expectedDelivery, BigDecimal totalAmount, String paymentStatus) {
        this.id = id;
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.status = status;
        this.currentLocation = currentLocation;
        this.expectedDelivery = expectedDelivery;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
    }
}
