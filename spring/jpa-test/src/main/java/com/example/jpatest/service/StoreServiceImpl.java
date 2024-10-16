package com.example.jpatest.service;

import com.example.jpatest.domain.dto.*;
import com.example.jpatest.domain.entity.Store;
import com.example.jpatest.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    @Override
    public StoreResponse saveStore(StoreRequest storeRequest) {
        Store store = storeRequest.toEntity();
        Store saveStore = storeRepository.save(store);
        return StoreResponse.from(saveStore);
    }

    @Override
    public List<StoreResponse> getAllStores() {
        return storeRepository.findJoinAll()
                .stream()
                .map(StoreResponse::from)
                .toList();
    }
}
