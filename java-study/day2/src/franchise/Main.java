package franchise;

import burger.Food;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("매머드", 9, 19);

        store.addMenu(new Food("아메리카노", 1000, Arrays.asList("샷", "얼음", "물")));
        store.addMenu(new Food("라떼", 2000, Arrays.asList("샷", "얼음", "우유")));

        store.print();

        System.out.println();
        store.removeMenu("아메리카노");
        store.print();
    }
}
