package com.example.bank.domain.dto.request;

import com.example.bank.domain.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

public record RegisterRequest(String email, String password, String username) {

    public User toEntity(PasswordEncoder passwordEncoder) {
        return User.builder()
                .username(username)
                .email(email)
                .password(passwordEncoder.encode(password))
                .build();
    }
}
