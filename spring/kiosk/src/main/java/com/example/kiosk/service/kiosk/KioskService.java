package com.example.kiosk.service.kiosk;

import com.example.kiosk.domain.dto.kiosk.KioskResponse;
import com.example.kiosk.domain.dto.kiosk.KioskRequest;

import java.util.List;

public interface KioskService {

    List<KioskResponse> getAllKiosks();
    KioskResponse getKioskById(int id);
    KioskResponse addKiosk(KioskRequest kioskRequest);
    void deleteKiosk(int id);
}
