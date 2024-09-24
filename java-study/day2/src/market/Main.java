package market;

import burger.Food;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList("빵", "패티", "샐러드");
        Food burger = new Food("햄버거", 5600, ingredients);
        List<String> cheeseBurgerIngredients = Arrays.asList("빵", "패티", "치즈", "샐러드");
        Food cheeseBurger = new Food("치즈버거", 6300, cheeseBurgerIngredients);

        Store burgerStore = new Store("버거 가게", new Date(), new Date());
        burgerStore.addMenu(burger);
        burgerStore.addMenu(cheeseBurger);
        burgerStore.printStoreInfo();
    }
}
