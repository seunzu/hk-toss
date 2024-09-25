package genericTest;

public class Food {
    private String name;
    
    public void eat() {
        System.out.println("냠냠");
    }

    public Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
