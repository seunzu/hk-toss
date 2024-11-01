package com.product.query.kafka;

import com.product.query.entity.Product;

public interface KafkaProductService {

    void receive(Long productId);
    void sell(Long productId);
    void save(Product product);
}
