package primitiveType;//3000 아아, 시간 당 4잔, 알바 1명, 시급 10030
//알바 5시간 쓰고 운영 8시간
//내가 한달(30일) 운영 했을 때 총 순수익

public class Main4 {
    public static void main(String[] args) {
        // ver 1
        // System.out.println(30 * (3000 * 4 * 8 - 5 * 10030));

        // ver 2
        int iceAme = 3000;
        int alba = 10030;
        int openTime = 8;
        int partTime = 5;

        System.out.println((((iceAme*4)*openTime) - (alba*partTime))*30);
    }
}