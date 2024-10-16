package com.example.jpatest.service;

import com.example.jpatest.domain.dto.*;
import com.example.jpatest.domain.entity.User;
import com.example.jpatest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = userRequest.toEntity();
        User saveUser = userRepository.save(user);
        return UserResponse.from(saveUser);
    }
    
    @Override
    @Transactional
    // jpa는 업데이트 변경 감지
    public UserResponse updateUser(Long id, UserRequest userRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        // ver1: setter 사용시 변경 열려 있어서 좋지 않음
//        user.setPassword(userRequest.password());
//        user.setUsername(userRequest.username());

        // ver2: 추가, 업데이트에 모두 열려있어서 별로 좋지 않음
//        User user = User.builder().id(id)
//                .password(userRequest.password())
//                .username(userRequest.username()).build();

        // ver3
        user.update(userRequest);
//        return UserResponse.from(userRepository.save(user)); -> @Transcational
        return UserResponse.from(user);
    }

    @Override
    public void deleteUserById(Long id) {
        if (!userRepository.existsById(id)) throw new IllegalArgumentException("User not found");
        userRepository.deleteById(id);
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found"));
        return UserResponse.from(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findJoinAll()
                .stream()
                .map(UserResponse::from)
                .toList();
    }

    @Override
    public Page<UserResponse> pageUsers(Pageable pageable) {
        return userRepository
                .findAll(pageable)
                .map(UserResponse::from);
    }
}
