package com.example.bank.service;

import com.example.bank.domain.dto.request.LoginRequest;
import com.example.bank.domain.dto.request.RegisterRequest;
import com.example.bank.domain.dto.response.UserResponse;

public interface UserService {

    void register(RegisterRequest registerRequest);
    UserResponse login(LoginRequest loginRequest);
    UserResponse getById(String id);
}
