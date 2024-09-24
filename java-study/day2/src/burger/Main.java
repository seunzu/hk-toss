package burger;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList("빵", "패티", "샐러드");

        Food food = new Food("햄버거", 5600, ingredients);
        System.out.println(food.toString());
    }
}
