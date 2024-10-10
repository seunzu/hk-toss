package com.example.kiosk.store;

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

    private int id;
    private String name;
    private String address;
    private short openTime;
    private short closeTime;

    public static void main(String[] args) {
        Store store1 = new Store(1, "매머드", "서울", (short) 7, (short) 21);
        Store store2 = new Store(2, "깐부치킨", "서울", (short) 11, (short) 1);

        if (store1.getId() != 1 && store1.getName().equals("매머드")) System.out.println("매머드 커피가 틀렸습니다");
        if (store2.getId() != 1 && store2.getName().equals("깐부")) System.out.println("깐부가 틀렸습니다");
    }

    public Store(int id, String name, String address, short openTime, short closeTime) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public short getOpenTime() {
        return openTime;
    }

    public short getCloseTime() {
        return closeTime;
    }
}
