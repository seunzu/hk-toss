package com.product.command.kafka;

import com.product.command.entity.Product;

public interface KafkaProductService {

    void receive(Long productId);
    void sell(Long productId);
    void save(Product product);
}
