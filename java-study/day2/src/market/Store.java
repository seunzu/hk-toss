package market;

import burger.Food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {
    private String name;
    private Date opentime;
    private Date closetime;
    private List<Food> menus;

    public Store(String name, Date opentime, Date closetime) {
        this.name = name;
        this.opentime = opentime;
        this.closetime = closetime;
        this.menus = new ArrayList<>();
    }

    public void addMenu(Food food) {
        if (menus.size() < 7) menus.add(food);
        else System.out.println("X");
    }

    public void printMenus() {
        for (Food menu : menus) System.out.println(menu.toString());
    }

    public int getTotalPrice() {
        int total = 0;
        for (Food menu : menus) total += menu.getPrice();
        return total;
    }

    public double getAvgPrice() {
        if (menus.isEmpty()) return 0;
        return (double) getTotalPrice() / menus.size();
    }

    public void printStoreInfo() {
        System.out.println("이름: " + name + ", 오픈 시간: " + opentime + ", 닫는 시간: " + closetime);
        System.out.println("== 메뉴 ==");
        printMenus();
        System.out.println("총합 가격: " + getTotalPrice() + "원");
        System.out.println("평균 가격: " + getAvgPrice() + "원");
    }


}
