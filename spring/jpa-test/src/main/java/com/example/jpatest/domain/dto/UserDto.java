package com.example.jpatest.domain.dto;

import com.example.jpatest.domain.entity.User;

import java.util.List;

public record UserDto(Long id, String email, String username) {

    public static UserDto from(User user) {
        return new UserDto(user.getId(), user.getEmail(), user.getUsername());
    }
}
