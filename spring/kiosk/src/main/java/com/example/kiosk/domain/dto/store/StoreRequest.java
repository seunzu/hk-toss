package com.example.kiosk.domain.dto.store;

import com.example.kiosk.domain.entity.Store;

public record StoreRequest(String name, String address, short openTime, short closeTime) {

    public Store toStore() {
        return new Store(name, address, openTime, closeTime);
    }
}
