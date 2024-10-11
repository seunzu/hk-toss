package com.example.kiosk.exception.store;

public class StoreNotFoundException extends IllegalArgumentException {

    public StoreNotFoundException(int id) {
        super("Store: " + id + " IS NOT FOUND");
    }

}
