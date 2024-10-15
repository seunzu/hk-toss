package com.example.jpatest.repository;

import com.example.jpatest.domain.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

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
//    @Transactional
    void saveTest() {
        // given: 이러한 값이 주어지고
        String email = "email";
        String password = "pass";
        String username = "user";

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
        for (int i = 0; i < 5; i++) {
            String email = "email" + i;
            String password = "pass" + i;
            String username = "user" + i;

            User user = User.builder()
                    .email(email)
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
        String email = "email";
        String password = "pass";
        String username = "user";

        User user = User.builder()
                .email(email)
                .password(password)
                .username(username).build();

        userRepository.save(user);

        Optional<User> byEmail = userRepository.findByEmail(email);
        assertTrue(byEmail.isPresent());
        assertEquals(email, byEmail.get().getEmail());
    }
}
