package com.example.jpatest.service;

import com.example.jpatest.domain.dto.*;
import org.springframework.data.domain.*;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);
    UserResponse updateUser(Long id, UserRequest userRequest);
    void deleteUserById(Long id);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
    Page<UserResponse> pageUsers(Pageable pageable);
}
