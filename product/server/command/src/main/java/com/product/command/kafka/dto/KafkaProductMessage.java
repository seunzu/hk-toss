package com.product.command.kafka.dto;

import com.product.command.entity.Product;

import java.time.LocalDateTime;

public record KafkaProductMessage(LocalDateTime timestamp, Product message, String action) {

}
