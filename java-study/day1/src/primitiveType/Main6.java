package primitiveType;//while을 사용해서 1 ~ 100까지
//2의 배수는 1 더해서 출력
//3의 배수는 -1 해서 출력
//2와 3 공배수는 2와 3 공배수 (해당 숫자)
//배수가 아니면 NO 출력

public class Main6 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 31) { // for (int i = 1; i <= 30; i++)
            // ver 1
//            if (i % 2 == 0) {
//                if (i % 3 == 0) System.out.println(i);
//                else System.out.println(i + 1);
//            }

            // ver 2
//            if (i % 2 == 0 && i % 3 == 0) System.out.println(i);
//            else if (i % 2 == 0) System.out.println(i + 1);
//            else if (i % 3 == 0) System.out.println(i - 1);

            // ver 3
            boolean is2multi = i % 2 == 0;
            boolean is3multi = i % 3 == 0;
            boolean is6multi = is3multi && is2multi;
            boolean isZero = i == 0;

            if (isZero) System.out.println(0);
            if (is6multi) System.out.println(i);
            else if(is2multi) System.out.println(i + 1);
            else if(is3multi) System.out.println(i - 1);
            else System.out.println("NO");
            i++;
        }
    }
}