package com.product.query.service;

import com.product.query.entity.Product;
import com.product.query.kafka.KafkaProductService;
import com.product.query.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class KafkaProductServiceImpl implements KafkaProductService {
    private final ProductRepository repository;
    public List<Product> getProducts(){
        return repository.findAll();
    }

    @Override
    public void receive(Long productId) {
        Optional<Product> byId = repository.findById(productId);
        if (byId.isEmpty()) return;
        Product product = byId.get();
        product.setQuantity(product.getQuantity() + 1);
        repository.save(product);
    }

    @Override
    public void sell(Long productId) {
        Optional<Product> byId = repository.findById(productId);
        if (byId.isEmpty()) return;
        Product product = byId.get();
        product.setQuantity(product.getQuantity() - 1);
        repository.save(product);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }
}