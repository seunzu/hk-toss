package com.example.springdb.service;

import com.example.springdb.domain.entity.Store;
import com.example.springdb.repository.StoreRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Entity 매니저에 찾아온 값을 등록하고 조회해서 없다면 실제 db 찾음
 * 있으면 entity 매니저가 바로 리턴 -> db 부하 줄일 수 있음 => jpa 사용 이유
 * entity 매니저의 생명주기: 트랜잭션이 맺어지고 소멸까지
 */


@Service
@RequiredArgsConstructor
@Slf4j
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    @Override
    public Store save(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public Store getById(Long id) {
        return storeRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Store> getAll() {
        return storeRepository.findAll();
    }

    @Override
    public List<Store> getByContainName(String name) {
        return storeRepository.findByNameContain(name);
    }

    @Override
    public void deleteById(Long id) {
        storeRepository.deleteById(id);
    }

    @Override
    @Transactional // error: rollback, return: commit
    public Store update(Long id, Store store) {
        Store store1 = getById(id);
        store1.setAddress(store.getAddress());
        store1.setName(store.getName());
//        return storeRepository.save(store1);
        return store1;
    }

}
