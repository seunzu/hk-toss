package com.example.jpatest.domain.dto;

import com.example.jpatest.domain.entity.User;

public record UserResponse(Long id, String email, String username) {

    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getEmail(), user.getUsername());
    }

}
