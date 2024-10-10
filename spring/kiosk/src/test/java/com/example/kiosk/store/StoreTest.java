package com.example.kiosk.store;

import org.junit.jupiter.api.Test;

public class StoreTest {

    @Test
    public void testStoreCreation() {
        Store store1 = new Store("매머드", "서울", (short) 7, (short) 21);
        Store store2 = new Store("깐부치킨", "서울", (short) 11, (short) 1);

        if (store1.getId() != 1 && store1.getName().equals("매머드")) System.out.println("매머드 커피가 틀렸습니다");
        if (store2.getId() != 1 && store2.getName().equals("깐부")) System.out.println("깐부가 틀렸습니다");

        Store store3 = new Store(null, null, (short) 11, (short) 1);
        if (store3.getId() != 3) System.out.println("세 번째 커피집이 틀렸습니다.");
    }
}
