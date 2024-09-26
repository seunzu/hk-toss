package cafe;

public class Coffee {
    private String name;
    private int price;
    private SeasonType season; // 봄, 여름, 가을, 겨울
    private CategoryType category; // 커피, 티, 에이드

    // 팩토리 메서드
    // IllegalArgumentException: No enum constant cafe.CategoryType.COFFEE1
    // NumberFormatException: For input string: "3000d"

    public static Coffee of(String[] strings) {
        String name = strings[0];
        int price = Integer.parseInt(strings[1]);
        SeasonType season = SeasonType.valueOf(strings[2]);
        CategoryType category = CategoryType.valueOf(strings[3]);
//        if (!category.equals("커피")) return null;
        return new Coffee(name, price, season, category);
    }

    private Coffee(String name, int price, SeasonType season, CategoryType category) {
        this.name = name;
        this.price = price;
        this.season = season;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public SeasonType getSeason() {
        return season;
    }

    public CategoryType getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", season='" + season + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
