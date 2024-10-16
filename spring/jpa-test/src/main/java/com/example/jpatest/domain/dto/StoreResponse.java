package com.example.jpatest.domain.dto;

import com.example.jpatest.domain.entity.Store;

import java.util.ArrayList;
import java.util.List;

public record StoreResponse(Long id, String name, String address, UserDto user) {

    public static StoreResponse from(Store store) {
        return new StoreResponse(
                store.getId(),
                store.getName(),
                store.getAddress(),
                UserDto.from(store.getUser())
        );
    }
}
