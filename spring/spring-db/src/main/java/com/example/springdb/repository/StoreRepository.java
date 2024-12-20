package com.example.springdb.repository;

import com.example.springdb.domain.entity.Store;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findByNameContainingOrderByIdDesc(String name);

    @Query("SELECT s FROM Store s WHERE s.name LIKE %?1%")
    List<Store> findByNameContain(String name);

//     1. 이름으로 삭제
    @Transactional
    @Modifying
    @Query("DELETE FROM Store s WHERE s.name = :name")
    void deleteByName(String name);

//     2. 아이디가 5 이상의 것들 출력
    @Query("SELECT s FROM Store s WHERE s.id >= 5")
    List<Store> findByNameLike();

//     3. '매'가 포함된 name address 둘 중 하나라도 들어가있는 것 출력
    @Query("SELECT s FROM Store s WHERE s.name LIKE %:keyword% OR s.address LIKE %:keyword%")
    List<Store> findByNameOrAddressContaining(String keyword);

}
