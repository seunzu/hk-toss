package set;

import generic.Food;

import java.util.HashSet;
import java.util.Set;

public class Main {
//    set: 순서 X, 중복 X
    public static void main(String[] args) {
        Set<Food> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Food food = new Food("dasd" + i);
            set.add(food);
        }
//        Iterator iterator = set.iterator();
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(iterator.next());
//        }
        for (Food food : set) {
            System.out.println(food);
        }
        System.out.println(set);
    }
}
