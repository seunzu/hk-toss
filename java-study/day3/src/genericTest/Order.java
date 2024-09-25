package genericTest;

public class Order<T> {

    private final int price;
    private final T date;

    public Order(int price, T date) {
        this.price = price;
        this.date = date;
    }

    public T getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", date=" + date +
                '}';
    }
}
