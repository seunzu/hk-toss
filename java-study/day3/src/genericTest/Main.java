package genericTest;

public class Main {
    public static void main(String[] args) {
        Order<String> order = new Order<>(1000, "st");
        System.out.println(order);
        Order<Food> order1 = new Order<>(10, new Food("고기"));
        System.out.println(order1);
        Order<Product> order2 = new Order<>(1000, new Product("tv"));
        System.out.println(order2);
        order1.getDate().eat();
    }
}
