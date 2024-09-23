package referenceType;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int coffee1 = 6000;
        int coffee2 = 7000;
        int coffee3 = 8000;

        int[] coffees = {coffee1, coffee2, coffee3};
        int first = coffees[0];
//        System.out.println(first);
//        System.out.println(coffees.length);
//
        for (int coffee : coffees) {
            System.out.print(coffee + " ");
        }
//        System.out.println(Arrays.toString(coffees));
    }
}