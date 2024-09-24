package burger;

// 햄버거 5600 재료로 빵이랑 패티 샐러드
// print()
// 이 음식은 햄버거로 가격은 5600원, 재료는 빵, 패티, 샐러드가 존재
public class Food {
    String name;
    int price;
    String[] ingredients;

    public Food(String name, int price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public void print() {
        String ingredientsList = String.join(", ", ingredients);
        System.out.println("이름: " + name + ", 재료: " + ingredientsList + ", 가격: " + price);
    }
}


