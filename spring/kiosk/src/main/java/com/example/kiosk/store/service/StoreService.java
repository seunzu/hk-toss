package com.example.kiosk.store.service;

import com.example.kiosk.store.domain.Store;
import com.example.kiosk.store.domain.StoreRequest;
import com.example.kiosk.store.domain.StoreResponse;

import java.util.List;

public interface StoreService {

    List<StoreResponse> getAllStores();
    Store getStoreById(int id);
    Store addStore(StoreRequest storeRequest);
    void deleteStore(int id);
    Store updateStore(int id, StoreRequest storeRequest);
}
