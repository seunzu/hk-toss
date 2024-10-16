package com.example.jpatest.controller;

import com.example.jpatest.domain.dto.StoreRequest;
import com.example.jpatest.domain.dto.StoreResponse;
import com.example.jpatest.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stores")
public class StoreController {

    private final StoreService storeService;

    @PostMapping
    public ResponseEntity<StoreResponse> addStore(@RequestBody StoreRequest storeRequest) {
        StoreResponse store = storeService.saveStore(storeRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(store);
    }

    @GetMapping
    public ResponseEntity<List<StoreResponse>> getAllStores() {
        List<StoreResponse> stores = storeService.getAllStores();
        return ResponseEntity.ok(stores);
    }
}
