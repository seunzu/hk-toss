package cafe;

import controller.CafeController;

import static global.Data.coffees;

public class Main2 {
    public static void main(String[] args) {
        CafeController cafeController = CafeController.getInstance();
        cafeController.addCoffee();

        for (Coffee coffee : coffees) System.out.println(coffee);
    }
}
