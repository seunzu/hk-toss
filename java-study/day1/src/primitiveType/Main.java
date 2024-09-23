package primitiveType;

// 구구단
public class Main {
    public static void main(String[] args) {
        // 2 ~ 19
        for (int i = 2; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
                //  System.out.println(i + "X" + j + "=" + i*j);
            }
        }
    }
}