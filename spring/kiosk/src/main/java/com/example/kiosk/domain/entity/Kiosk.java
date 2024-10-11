package com.example.kiosk.domain.entity;

import com.example.kiosk.util.KioskUtils;

public class Kiosk {

    private final int id;
    private final int kioskNumber;
    private final Store store;
    private boolean active;

    public Kiosk(int kioskNumber, Store store) {
        this.id = KioskUtils.kioskCount++;;
        this.kioskNumber = kioskNumber;
        this.store = store;
        this.active = true;
    }

    public int getId() {
        return id;
    }

    public int getKioskNumber() {
        return kioskNumber;
    }

    public Store getStore() {
        return store;
    }

    public boolean isActive() {
        return active;
    }

    public void crash() {
        this.active = false;
    }
}
