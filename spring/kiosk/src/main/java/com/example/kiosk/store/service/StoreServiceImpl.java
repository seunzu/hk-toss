package com.example.kiosk.store.service;

import com.example.kiosk.store.Store;
import com.example.kiosk.store.StoreNotFoundException;
import com.example.kiosk.store.StoreRequest;
import com.example.kiosk.store.Utils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    public List<Store> getAllStores() {
        return Utils.stores;
    }

    public Store getStoreById(int id) {
        return Utils.stores
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StoreNotFoundException(id));
    }

    public Store addStore(StoreRequest storeRequest) {
        Store store = storeRequest.toStore();
        Utils.stores.add(store);
        return store;
    }

    public void deleteStore(int id) {
        Store store = getStoreById(id);
        Utils.stores.remove(store);
    }

    public Store updateStore(int id, StoreRequest storeRequest) {
        Store store = getStoreById(id);
        return store.update(storeRequest);
    }
}
