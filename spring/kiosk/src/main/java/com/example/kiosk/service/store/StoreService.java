package com.example.kiosk.service.store;

import com.example.kiosk.domain.entity.Store;
import com.example.kiosk.domain.dto.store.StoreRequest;
import com.example.kiosk.domain.dto.store.StoreResponse;

import java.util.List;

public interface StoreService {

    List<StoreResponse> getAllStores();
    Store getStoreById(int id);
    Store addStore(StoreRequest storeRequest);
    void deleteStore(int id);
    Store updateStore(int id, StoreRequest storeRequest);
}
