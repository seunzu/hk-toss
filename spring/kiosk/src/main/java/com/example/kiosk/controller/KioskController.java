package com.example.kiosk.controller;

import com.example.kiosk.domain.dto.kiosk.KioskResponse;
import com.example.kiosk.domain.dto.kiosk.KioskRequest;
import com.example.kiosk.service.kiosk.KioskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kiosk")
public class KioskController {

    private KioskService kioskService;

    public KioskController(KioskService kioskService) {
        this.kioskService = kioskService;
    }

    @GetMapping
    public List<KioskResponse> getAllKiosks() {
        return kioskService.getAllKiosks();
    }

    @GetMapping("/{id}")
    public KioskResponse getKioskById(@PathVariable int id) {
        return kioskService.getKioskById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public KioskResponse addKiosk(@RequestBody KioskRequest kioskRequest) {
        return kioskService.addKiosk(kioskRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteKiosk(@PathVariable int id) {
        kioskService.deleteKiosk(id);
    }


}
