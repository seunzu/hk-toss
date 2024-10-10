package com.example.kiosk.store.service;

import com.example.kiosk.store.Store;
import com.example.kiosk.store.StoreRequest;

import java.util.List;

public interface StoreService {

    List<Store> getAllStores();
    Store getStoreById(int id);
    Store addStore(StoreRequest storeRequest);
    void deleteStore(int id);
    Store updateStore(int id, StoreRequest storeRequest);
}
