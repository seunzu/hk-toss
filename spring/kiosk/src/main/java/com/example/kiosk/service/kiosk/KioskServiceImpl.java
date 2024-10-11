package com.example.kiosk.service.kiosk;

import com.example.kiosk.domain.dto.kiosk.KioskResponse;
import com.example.kiosk.domain.dto.kiosk.KioskRequest;
import com.example.kiosk.domain.entity.Kiosk;
import com.example.kiosk.domain.entity.Store;
import com.example.kiosk.exception.kiosk.KioskNotFoundException;
import com.example.kiosk.util.KioskUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KioskServiceImpl implements KioskService {

    private final GetStoreService storeService;

    public KioskServiceImpl(GetStoreService storeService) {
        this.storeService = storeService;
    }

    public Optional<Kiosk> getOptionalKioskById(int id) {
        return KioskUtils.kiosks
                .stream()
                .filter(kiosk -> kiosk.isActive() && kiosk.getId() == id)
                .findFirst();
    }

    @Override
    public List<KioskResponse> getAllKiosks() {
        return KioskUtils.kiosks.stream()
                .map(KioskResponse::from)
                .toList();
    }

    @Override
    public KioskResponse getKioskById(int id) {
        return getOptionalKioskById(id)
                .map(KioskResponse::from)
                .orElseThrow(() -> new KioskNotFoundException(id));
    }

    @Override
    public KioskResponse addKiosk(KioskRequest kioskRequest) {
        Store store = storeService
                .getOptionalKioskById(kioskRequest.storeId())
                .orElseThrow(() -> new KioskNotFoundException(kioskRequest.storeId()));
        Kiosk kiosk = new Kiosk(kioskRequest.kioskNumber(), store);
        KioskUtils.kiosks.add(kiosk);
        kiosk.getStore().getKiosks().add(kiosk);
        return KioskResponse.from(kiosk);
    }

    @Override
    public void deleteKiosk(int id) {
        getOptionalKioskById(id)
                .orElseThrow(() -> new KioskNotFoundException(id))
                .crash();
    }
}
