package com.example.jpatest.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDERS", indexes = {@Index(columnList = "productName")})
public class Order {

    @Id @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long price;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "STORE_ID")
    private Store store;
}