package com.example.kiosk.domain.dto.kiosk;

import com.example.kiosk.domain.entity.Kiosk;
import com.example.kiosk.domain.entity.Store;

public record KioskResponse(int id, int kioskNumber, Store store) {

     public static KioskResponse from(Kiosk kiosk) {
         return new KioskResponse(kiosk.getId(),
                 kiosk.getKioskNumber(),
                 kiosk.getStore());
     }
}
