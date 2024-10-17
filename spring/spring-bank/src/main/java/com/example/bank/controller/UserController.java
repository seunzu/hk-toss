package com.example.bank.controller;

import com.example.bank.domain.dto.request.LoginRequest;
import com.example.bank.domain.dto.request.RegisterRequest;
import com.example.bank.domain.dto.response.UserResponse;
import com.example.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest){
        userService.register(registerRequest);
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest);
    }

    @GetMapping("/me")
    public UserResponse me(@RequestHeader("Authorization") String id){
        return userService.getById(id);
    }
}
