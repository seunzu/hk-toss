package com.example.jpatest.domain.dto;

import com.example.jpatest.domain.entity.User;

public record UserRequest(String email, String password, String username) {

    // 팩토리 메서드
    public User toEntity() {
        return User.builder()
                .email(email)
                .password(password)
                .username(username)
                .build();
    }
}

