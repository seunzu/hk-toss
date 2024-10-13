package com.example.kiosk.service.store;

import com.example.kiosk.domain.entity.Kiosk;
import com.example.kiosk.domain.entity.Store;
import com.example.kiosk.exception.store.StoreNotFoundException;
import com.example.kiosk.domain.dto.store.StoreRequest;
import com.example.kiosk.service.kiosk.GetStoreService;
import com.example.kiosk.util.StoreUtils;
import com.example.kiosk.domain.dto.store.StoreResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService, GetStoreService, KioskService {

    public List<StoreResponse> getAllStores() {
        List<StoreResponse> list = StoreUtils.stores
                .stream()
                .map(StoreResponse::from)
                .toList();
        return list;
    }

    public Store getStoreById(int id) {
        return StoreUtils.stores
                .stream()
                .filter(el -> el.getId() == id && !el.isDeleted())
                .findFirst()
                .orElseThrow(() -> new StoreNotFoundException(id));
    }

    public Store addStore(StoreRequest storeRequest) {
        Store store = storeRequest.toStore();
        StoreUtils.stores.add(store);
        return store;
    }

    public void deleteStore(int id) {
        Store storeById = getStoreById(id);
        storeById.delete();
    }

    public Store updateStore(int id, StoreRequest storeRequest) {
        return getStoreById(id).update(storeRequest);
    }

    @Override
    public Optional<Store> getOptionalStoreById(int id) {
        return StoreUtils.stores
                .stream()
                .filter(el -> el.getId() == id && !el.isDeleted())
                .findFirst();
    }

    @Override
    public List<Kiosk> getKiosksByStoreId(int storeId) {
        return List.of();
    }
}
