package com.example.jpatest.service;

import com.example.jpatest.domain.dto.*;

import java.util.List;

public interface StoreService {

    StoreResponse saveStore(StoreRequest storeRequest);
    List<StoreResponse> getAllStores();
}
