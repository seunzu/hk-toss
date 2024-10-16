package com.example.jpatest.repository;

import com.example.jpatest.domain.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {
    @Query("select s from Store s " +
//            "join User u on s.user.id = u.id")
//            "join USer u on s.user = u"
            "join fetch s.user")
    List<Store> findJoinAll();
}
