package burger;

public class Main {
    public static void main(String[] args) {
        String[] ingredients = new String[]{"빵", "패티", "샐러드"};

        Food food = new Food("햄버거", 5600, ingredients);
        food.print();
    }
}
