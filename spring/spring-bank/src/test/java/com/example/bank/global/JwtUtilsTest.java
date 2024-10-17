package com.example.bank.global;

import org.junit.jupiter.api.Test;

class JwtUtilsTest {

    @Test
    void generateToken() {
        JwtUtils jwtUtils = new JwtUtils(
                1000*60,
                "bdsfgafowebiufbgewiagbkjcbxlzlkjx");

        String token = jwtUtils.generateToken("hello");
        System.out.println(token);
    }

}