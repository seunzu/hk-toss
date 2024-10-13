package com.example.kiosk.service.store;

import com.example.kiosk.domain.entity.Kiosk;

import java.util.List;

public interface KioskService {

    List<Kiosk> getKiosksByStoreId(int storeId);
}
