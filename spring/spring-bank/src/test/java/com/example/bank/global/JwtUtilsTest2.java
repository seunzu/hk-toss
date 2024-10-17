package com.example.bank.global;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class JwtUtilsTest2 {

    @Value("${jwt.secret}")
    String secret;

    @Test
    void Test() {
        assertEquals("vbasdf4wtrdsgsghasdfasdgasdghasdhasdf23radgsdgahasdf", secret);
    }
}
