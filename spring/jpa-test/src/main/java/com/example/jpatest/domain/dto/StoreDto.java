package com.example.jpatest.domain.dto;

import com.example.jpatest.domain.entity.Store;

import java.util.List;

public record StoreDto(Long id, String name, String address) {

    public static StoreDto from(Store store) {
        return new StoreDto(store.getId(), store.getName(), store.getAddress());
    }
}
