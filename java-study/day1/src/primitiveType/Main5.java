package primitiveType;//내가 5000원 가지고 있고 커피 3000원
//커피를 살 수 있으면 커피 한잔 출력
//못 사면 다음에 올게요 출력

public class Main5 {
    public static void main(String[] args) {
        int coffee = 3000;
        int money = 5000;

        if (money / coffee > 0) System.out.println("coffee");
        else System.out.println("다음에 올게요");
    }
}