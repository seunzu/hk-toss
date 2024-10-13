package com.example.kiosk.service.storekiosk;

import com.example.kiosk.domain.dto.kiosk.KioskResponse;
import com.example.kiosk.domain.entity.Kiosk;

import java.util.List;

public interface StoreKioskService {

    KioskResponse addKiosk(int storeId);
    List<KioskResponse> getKiosksByStore(int storeId);
    KioskResponse getKioskById(int storeId, int kioskId);
    void deleteKiosk(int storeId, int kioskId);
}
