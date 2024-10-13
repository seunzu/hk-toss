package com.example.kiosk.service.storekiosk;

import com.example.kiosk.domain.dto.kiosk.KioskRequest;
import com.example.kiosk.domain.dto.kiosk.KioskResponse;
import com.example.kiosk.domain.entity.Kiosk;
import com.example.kiosk.domain.entity.Store;
import com.example.kiosk.exception.kiosk.KioskNotFoundException;
import com.example.kiosk.exception.store.StoreNotFoundException;
import com.example.kiosk.service.kiosk.KioskService;
import com.example.kiosk.service.store.StoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreKioskServiceImpl implements StoreKioskService {

    private final StoreService storeService;
    private final KioskService kioskService;

    public StoreKioskServiceImpl(StoreService storeService, KioskService kioskService) {
        this.storeService = storeService;
        this.kioskService = kioskService;
    }

    @Override
    public KioskResponse addKiosk(int storeId) {
        Store store = storeService.getStoreById(storeId);
        if (store == null) throw new StoreNotFoundException(storeId);

        int kioskNumber = store.getKiosks().isEmpty() ? 1 : store.getKiosks().size() + 1;
        KioskRequest kioskRequest = new KioskRequest(store.getId(), kioskNumber);
        return kioskService.addKiosk(kioskRequest);
    }

    @Override
    public List<KioskResponse> getKiosksByStore(int storeId) {
        Store store = storeService.getStoreById(storeId);
        if (store == null) throw new StoreNotFoundException(storeId);

        return kioskService.getAllKiosks();
    }

    @Override
    public KioskResponse getKioskById(int storeId, int kioskId) {
        Store store = storeService.getStoreById(storeId);
        if (store == null) throw new StoreNotFoundException(storeId);

        return kioskService.getKioskById(kioskId);
    }


    @Override
    public void deleteKiosk(int storeId, int kioskId) {
        Store store = storeService.getStoreById(storeId);
        if (store == null) throw new StoreNotFoundException(storeId);

        kioskService.deleteKiosk(kioskId);
    }
}