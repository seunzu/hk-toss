package com.example.bank.global;

import org.junit.jupiter.api.Test;

class JwtUtilsTest {

    @Test
    void generateToken() {
        JwtUtils jwtUtils = new JwtUtils(1000*60, "vbasdf4wtrdsgsghasdfasdgasdghasdh");

        String token = jwtUtils.generateToken("hello");
        System.out.println(token);
    }

    @Test
    void parseToken() {
        JwtUtils jwtUtils = new JwtUtils(1000*60, "vbasdf4wtrdsgsghasdfasdgasdghasdh");

        String hello = jwtUtils.parseToken("eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJoZWxsbyIsImV4cCI6MTcyOTEzOTkyN30.57vIM1oZmGg4hdEBMYVxo8-3dlYTRUvhtNzUsUI_nxG1Q8ETI-4gyB2Rc82avcVD");
        System.out.println(hello);
    }

}