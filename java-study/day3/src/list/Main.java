package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 200_000_00; i++) {
            long before = System.currentTimeMillis();
            list.add(i);
            long after = System.currentTimeMillis();
            System.out.println(before - after);
        }
    }
}
