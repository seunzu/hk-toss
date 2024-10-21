package com.example.bank.user.controller;

import com.example.bank.user.domain.dto.LoginRequest;
import com.example.bank.user.domain.dto.RegisterRequest;
import com.example.bank.user.domain.dto.UserResponse;
import com.example.bank.user.domain.entity.User;
import com.example.bank.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/user-service")
public class UserController {

    private final UserService userService;

    @PostMapping("/api/v1/auth/login")
    public String login(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest);
    }

    @GetMapping("/api/v1/auth/me")
    public UserResponse me(@AuthenticationPrincipal User user) {
        return UserResponse.from(user);
    }

    @PostMapping("/api/v1/auth/register")
    public void register(@RequestBody RegisterRequest registerRequest){
        userService.register(registerRequest);
    }

}
