package com.example.bank.controller;

import com.example.bank.domain.dto.request.*;
import com.example.bank.domain.dto.response.UserResponse;
import com.example.bank.domain.entity.User;
import com.example.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api/v1/auth")
public class UserController {

    private final UserService userService;

    @PostMapping("/api/v1/auth/register")
    public void register(@RequestBody RegisterRequest registerRequest){
        userService.register(registerRequest);
    }

    @PostMapping("/api/v1/auth/login")
    public String login(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest);
    }

    @GetMapping("/api/v1/auth/me")
    public UserResponse me(@AuthenticationPrincipal User user){
        return UserResponse.from(user);
    }

//    @GetMapping("/me")
//    public UserResponse me(@RequestHeader("Authorization") String token){
//        if(!token.startsWith("Bearer ")) throw new RuntimeException("토큰 틀림");
//        return userService.getByToken(token.substring(7));
//    }
}
