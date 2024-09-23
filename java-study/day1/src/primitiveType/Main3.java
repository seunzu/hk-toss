package primitiveType;

public class Main3 {
    public static void main(String[] args) {
        // ver 1
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        // ver 2
//         while (조건) {
//             조건이 맞으면 실행
//         }

        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        // ver 3
//        do {
//            무조건 한 번 실행
//        } while (조건)
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}