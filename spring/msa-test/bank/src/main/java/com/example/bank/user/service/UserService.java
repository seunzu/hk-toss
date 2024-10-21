package com.example.bank.user.service;

import com.example.bank.user.domain.dto.LoginRequest;
import com.example.bank.user.domain.dto.RegisterRequest;
import com.example.bank.user.domain.dto.UserResponse;

public interface UserService {

    String login(LoginRequest loginRequest);
    void register(RegisterRequest registerRequest);
    UserResponse getById(String id);
    UserResponse getByToken(String token);
}
