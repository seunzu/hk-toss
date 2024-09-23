package referenceType;

public class Main4 {
    public static void main(String[] args) {
        int[][] cp2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int len = cp2.length;

        System.out.println("\n#1");
        for (int[] x : cp2) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println("\n#2");
        for (int i = 0; i < len; i++) {
            for (int[] x : cp2) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }

        // 3-1
        System.out.println("\n#3-1");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(cp2[(i + 1) % 3][(j + 1) % 3] + " ");
            }
            System.out.println();
        }

        // 3-2
        System.out.println("\n#3-2");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(cp2[(i + 1) % 3][(j + 2) % 3] + " ");
            }
            System.out.println();
        }
    }
}