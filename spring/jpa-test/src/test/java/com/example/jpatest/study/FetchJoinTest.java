package com.example.jpatest.study;

import com.example.jpatest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class FetchJoinTest {

    // 패치 조인과 일반 조인 결과값 비교
    // User 테이블에 isDel = false인 users만 반환

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {

    }
}
