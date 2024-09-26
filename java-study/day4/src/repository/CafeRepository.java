package repository;

import cafe.Coffee;

import static global.Data.coffees;

public class CafeRepository {
    public void save(Coffee coffee) {
        coffees.add(coffee);
    }

    public static CafeRepository getInstance() {
        if (cafeRepository == null) {
            cafeRepository = new CafeRepository();
        }
        return cafeRepository;
    }

    private static CafeRepository cafeRepository;

    private CafeRepository() {};
}
