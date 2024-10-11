package com.example.kiosk.exception.kiosk;

public class KioskNotFoundException extends IllegalArgumentException{

    public KioskNotFoundException(int id) {
        super("Kiosk: " + id + " IS NOT FOUND");
    }
}
