package com.example.jpatest.repository;

import com.example.jpatest.domain.entity.User;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    @Query("SELECT u FROM User u join fetch u.stores")
    List<User> findJoinAll();

    // Page<User> findAll(PageRequest pageRequest);
}
