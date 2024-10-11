package com.example.kiosk.service.kiosk;

import com.example.kiosk.domain.entity.Store;

import java.util.Optional;

public interface GetStoreService {

    Optional<Store> getOptionalKioskById(int id);
}
