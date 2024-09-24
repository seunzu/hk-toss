package franchise;

import burger.Food;

import java.util.ArrayList;
import java.util.List;

public class Store implements StoreAction {

    private String name;
    private int openTime;
    private int closeTime;
    private List<Food> menus;
    private double averagePrice;
    private int menuCount;
    private long totalPrice;

    public Store(String name, int openTime, int closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.menus = new ArrayList<>();
        this.averagePrice = 0;
        this.menuCount = 0;
        this.totalPrice = 0;
    }

    @Override
    public boolean addMenu(Food food) {
        if (menus.size() < 7) {
            menus.add(food);
            menuCount++;
            totalPrice += food.getPrice();
            averagePrice = (double) totalPrice / menuCount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeMenu(String name) {
        for (Food menu : menus) {
            if (menu.getName().equals(name)) {
                menus.remove(menu);
                menuCount--;
                totalPrice -= menu.getPrice();
                averagePrice = (menuCount == 0) ? 0 : (double) totalPrice / menuCount;
                return true;
            }
        }
        return false;
    }

    @Override
    public String getMenuArr() {
        StringBuilder sb = new StringBuilder();
        for (Food menu : menus) {
            sb.append(menu.toString()).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public void print() {
        System.out.println("가게 이름: " + name + "\n열리는 시간: " + openTime + "\n닫는 시간: " + closeTime);
        System.out.println("====메뉴====\n" + getMenuArr());
        System.out.println("메뉴의 총 가격: " + totalPrice + "원" + "\n메뉴는 총 " + menuCount + "개" + "\n평균 가격: " + averagePrice + "원");
    }
}


