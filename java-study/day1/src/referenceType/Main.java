package referenceType;

public class Main {
    public static void main(String[] args) {
        String x = "안녕하세요";
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(x);
        }

        String y = "";
        for (int i = 0; i < 1_000_000; i++) {
            y += x;
        }
        System.out.println(x);
    }
}

