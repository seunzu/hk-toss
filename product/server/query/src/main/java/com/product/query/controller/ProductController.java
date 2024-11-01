package com.product.query.controller;

import com.product.query.entity.Product;
import com.product.query.service.KafkaProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final KafkaProductServiceImpl productService;

    @GetMapping("/api/v1/products")
    public List<Product> getAll(){
        return productService.getProducts();
    }
}