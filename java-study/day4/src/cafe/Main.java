package cafe;

import java.util.Scanner;
import static global.Data.coffees;

// classname.staticMethod();
// classname:static변수;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Coffee[] coffees = Data.coffees;

        // 꽉차면 끝내고 커피를 하나씩 출력하기
        // 아메리카노 3000 WINTER COFFEE

        for (int i = 0; i < 5; i++) {
            String st = sc.nextLine();
            String[] strings = st.split(" ");
            try {
                coffees[i] = Coffee.of(strings);
            } catch (NumberFormatException e) {
                System.out.println("가격 입력 다시");
                i--;
            } catch (IllegalArgumentException e) {
                System.out.println("타입 입력 다시");
                i--;
            }
        }

        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
    }
}