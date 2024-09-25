package genericTest;

public class Product {
    private String name;
    
    public void sound(){
        System.out.println("딸깍딸깍");
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
