package com.example.bank.domain.dto.request;

import com.example.bank.domain.entity.User;

public record RegisterRequest(String email, String password, String username) {

    public User toEntity() {
        return User.builder()
                .username(username)
                .email(email)
                .password(password)
                .build();
    }
}
