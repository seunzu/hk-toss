package com.product.query.kafka.dto;

import com.product.query.entity.Product;

import java.time.LocalDateTime;

public record KafkaProductMessage(LocalDateTime timestamp, Product message, String action) {

}
