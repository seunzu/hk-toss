package com.product.command.controller;

import com.product.command.entity.Product;
import com.product.command.kafka.KafkaProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final KafkaProductService service;

    @PostMapping
    public void save(@RequestBody Product product) {
        service.save(product);
    }

    @PutMapping("{id}/selling")
    public void sell(@PathVariable Long id) {
        service.sell(id);
    }

    @PutMapping("{id}/receiving")
    public void receive(@PathVariable Long id) {
        service.receive(id);
    }
}
