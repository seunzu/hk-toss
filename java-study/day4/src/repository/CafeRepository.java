package repository;

import cafe.Coffee;
import util.CoffeeThread;

import java.util.List;

import static global.Data.coffees;

public class CafeRepository {
    public void save(Coffee coffee) {
        coffees.add(coffee);
        new CoffeeThread(coffee).start();
    }

    public List<Coffee> findAllCoffees() {
        return coffees;
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
