package com.example.jpatest.domain.dto;

import com.example.jpatest.domain.entity.*;

import java.util.ArrayList;

public record StoreRequest(String name, String address, Long userId) {

    public Store toEntity() {
        User user = User.builder().id(userId).build();
        return new Store(null, name, address, user, new ArrayList<>());
    }
}
