package com.example.jpatest.study;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class LocalDateTimeTest {

    @Test
    void test1() {
        // Wed Oct 16 13:52:18 KST 2024
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Wed Oct 16 13:52:18 KST 2024
        Date date = new Date();
        System.out.println(date);
    }
}
