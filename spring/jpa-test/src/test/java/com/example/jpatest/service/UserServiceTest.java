package com.example.jpatest.service;

import com.example.jpatest.domain.dto.UserResponse;
import com.example.jpatest.domain.entity.User;
import com.example.jpatest.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserServiceTest {

    @Test
    void createUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUserById() {
    }

    @Test
    void getUserById() {
        Long id = users.get(0).getId();

        UserResponse userById = userService.getUserById(id);

        assertNotNull(userById);
        assertEquals(id, userById.id());
        assertEquals(users.get(0).getEmail(), userById.email());
    }

    @Test
    void getAllUsers() {
        List<UserResponse> allUsers = userService.getAllUsers();
        assertEquals(10, allUsers.size());
        assertEquals(users.get(0).getId(), allUsers.get(0).id());
    }


    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    String email = "www@xxx.com";
    String password = "1234";
    String username = "admin";
    List<User> users;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl(userRepository);
        users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = User.builder()
                    .email(email + i)
                    .password(password)
                    .username(username + i).build();
            users.add(user);
        }
        userRepository.saveAll(users);
    }
}