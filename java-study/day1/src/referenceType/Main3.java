package referenceType;

// cpCoffees2도 0 = 100, 1 = 200, 2 = 300
// 둘이 같은지 비교해보고 cpCoffees == cpCoffees2
// 둘이 값이 같으면 true라고 출력 100, 200, 300

public class Main3 {
    public static void main(String[] args) {
        int[] cpCoffees = {100, 200, 300};
        int[] cpCoffees2 = new int[] {100, 200, 300};
        int[] cpCoffees3 = cpCoffees;
        System.out.println(cpCoffees == cpCoffees2);
        System.out.println(cpCoffees.equals(cpCoffees3));

        boolean isEqual = false;
        for (int i = 0; i < cpCoffees.length; i++) {
            isEqual = cpCoffees[i] == cpCoffees2[i];
            if (!isEqual) break;
        }
        System.out.println(isEqual);
    }
}
