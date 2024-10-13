package com.example.kiosk.controller;

import com.example.kiosk.domain.dto.kiosk.KioskResponse;
import com.example.kiosk.service.storekiosk.StoreKioskServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreKioskController {

    private final StoreKioskServiceImpl storeKioskService;

    public StoreKioskController(StoreKioskServiceImpl storeKioskService) {
        this.storeKioskService = storeKioskService;
    }

    @PostMapping("/{storeId}/kiosks")
    public ResponseEntity<KioskResponse> addKiosk(@PathVariable int storeId) {
        KioskResponse kiosk = storeKioskService.addKiosk(storeId);
        return ResponseEntity.status(HttpStatus.CREATED).body(kiosk);
    }

    @GetMapping("/{storeId}/kiosks")
    public ResponseEntity<List<KioskResponse>> getKiosksByStore(@PathVariable int storeId) {
        List<KioskResponse> kiosks = storeKioskService.getKiosksByStore(storeId);
        return ResponseEntity.ok(kiosks);
    }

    @GetMapping("/{storeId}/kiosks/{kioskId}")
    public ResponseEntity<KioskResponse> getKioskById(@PathVariable int storeId, @PathVariable int kioskId) {
        KioskResponse kiosk = storeKioskService.getKioskById(storeId, kioskId);
        return ResponseEntity.ok(kiosk);
    }

    @DeleteMapping("/{storeId}/kiosks/{kioskId}")
    public ResponseEntity<Void> deleteKiosk(@PathVariable int storeId, @PathVariable int kioskId) {
        storeKioskService.deleteKiosk(storeId, kioskId);
        return ResponseEntity.noContent().build();
    }
}