package com.example.jpatest.service;

import com.example.jpatest.domain.dto.*;
import com.example.jpatest.domain.entity.User;
import com.example.jpatest.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserServiceTest {

    @Test
    void createUser() {

        String email = "www1234@xxx.com";
        String password = "1234";
        String username = "admin";

        UserRequest userRequest = new UserRequest(email, password, username);
        UserResponse userResponse = userService.createUser(userRequest);

        assertNotNull(userResponse);
        User findUser = userRepository.findById(userResponse.id()).orElseThrow();
        assertEquals(email, findUser.getEmail());
        assertEquals(password, findUser.getPassword());
        assertEquals(username, findUser.getUsername());
    }

    @Test
    void updateUser() {
        User user = users.get(0);
        UserRequest userRequest = new UserRequest(user.getEmail(),
                user.getPassword() + "1231",
                user.getUsername());
        UserResponse userResponse = userService.updateUser(user.getId(), userRequest);

        assertNotNull(userResponse);

        User after = userRepository.findById(user.getId()).get();
        assertEquals(userRequest.password(), after.getPassword());
        assertEquals(userRequest.username(), after.getUsername());
        assertNotEquals(userRequest.email(), after.getEmail());
        assertEquals(user.getEmail(), userResponse.email());
    }

    @Nested
    class DeleteUserById {
        @Test
        @DisplayName("성공")
        void deleteUserById() {
            Long id = users.get(0).getId();
            userRepository.deleteById(id);
            assertEquals(9, userRepository.count());
        }

        @Test
        @DisplayName("실패: id가 없는 경우")
        void deleteUserById_failure() {
            Long id = -1L;
            assertThrows(IllegalArgumentException.class, () -> userRepository.deleteById(id));
        }
    }

    @Test
    void getAllUsers() {
        List<UserResponse> allUsers = userService.getAllUsers();
        assertEquals(10, allUsers.size());
        assertEquals(users.get(0).getId(), allUsers.get(0).id());
    }

    @Nested
    class GetUserById {
        @Test
        @DisplayName("성공")
        void getUserById() {
            Long id = users.get(0).getId();

            UserResponse userById = userService.getUserById(id);

            assertNotNull(userById);
            assertEquals(id, userById.id());
            assertEquals(users.get(0).getEmail(), userById.email());
        }

        @Test
        @DisplayName("실패: 못 찾았는 경우 NoSuchElementException 발생")
        void getUserById_failure_not_found() {
            Long id = 5421235L;
            assertThrows(NoSuchElementException.class, () -> userService.getUserById(id));
        }
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