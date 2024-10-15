package com.example.jpatest.repository;

import com.example.jpatest.domain.entity.User;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

// @SpringBootTest
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    String email = "email";
    String password = "pass";
    String username = "user";

    @BeforeEach
    void setUp() {
        User user = User.builder()
                .email(email)
                .password(password)
                .username(username).build();

        userRepository.save(user);
    }

    @Test
    @DisplayName("빌더_테스트")
    void builderTest() {
        User user = User.builder()
                .email("fasdf")
                .password("123")
                .username("fff").build();
        assertEquals(new ArrayList<>(), user.getStores());
        // assertEquals("fasdf1", user.getEmail()); -> fail
    }

    @Test
    @Transactional
    void saveTest() {
        // given: 이러한 값이 주어지고
        String email = "email22";
        User user = User.builder()
                .email(email)
                .password(password)
                .username(username).build();

        // when: 이거 실행했는데
        userRepository.save(user);

        // then: 그 후 이런 값이랑 매칭이 되었다
        assertEquals(email, user.getEmail());
        assertNotNull(user.getId());
    }

    // 5개 저장 -> 전부 맞음
    @Test
    void saveFiveFindFiveTest() {
        for (int i = 0; i < 4; i++) {
            User user = User.builder()
                    .email(email+i)
                    .password(password)
                    .username(username).build();

            userRepository.save(user);
        }

        List<User> users = userRepository.findAll();
        assertEquals(5, users.size());
        for (User user : users) assertNotNull(user.getId());
    }

    // email로 저장 -> email로 찾아오기
    @Test
    void saveByEmailFindByEmailTest() {
        Optional<User> byEmail = userRepository.findByEmail(email);
        assertTrue(byEmail.isPresent());
        assertEquals(email, byEmail.get().getEmail());
    }
}
