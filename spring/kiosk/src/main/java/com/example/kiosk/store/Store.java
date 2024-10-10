package com.example.kiosk.store;

import ch.qos.logback.core.util.StringUtil;

/**
 * 1. 가게
 * name: 메머드 커피
 * address: 서울
 * openTime: 7
 * closeTime: 21
 * id: ai
 *
 * 2. 가게
 * name: 깐부 치킨
 * address: 서울
 * openTime: 11
 * closeTime: 1
 * id: 2
 */

public class Store {
    private final int id;
    private String name;
    private String address;
    private short openTime;
    private short closeTime;

    public Store(String name, String address, short openTime, short closeTime) {
        this.id = Utils.storeCount++;
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public Store update(StoreRequest storeRequest) {
        if (!StringUtil.isNullOrEmpty(storeRequest.name())) {
            this.name = storeRequest.name();
        }
        if (!storeRequest.address().isEmpty()) {
            this.address = storeRequest.address();
        }
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
