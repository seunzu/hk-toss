package burger;

import java.util.List;

// 햄버거 5600 재료로 빵이랑 패티 샐러드
// print()
// 이 음식은 햄버거로 가격은 5600원, 재료는 빵, 패티, 샐러드가 존재
public class Food {
    private String name;
    private int price;
    private List<String> ingredients;

    public Food(String name, int price, List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String ingredientsList = String.join(", ", ingredients);
        return "이름: " + name + ", 가격: " + price + "원, 재료: " + ingredientsList;
    }
}


