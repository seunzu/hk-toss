package list;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(9);
        int target = 11;
        int[] answer = new int[2]; 

        // 조건1. 안에 있는 수 2개 더해서 target이 되어야 함
        // 조건2. 1 <= list 안에 있는 수 <= 10
        // 조건3. answer는 순서 X -> 순서 O?

        // #1
        // ver1
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                int sum = list.get(i) + list.get(j);
//                if (sum == target) {
//                    answer[0] = list.get(i);
//                    answer[1] = list.get(j);
//                    break;
//                }
//            }
//        }

        // ver2
//        for (int i : list) {
//            for (int j : list) {
//                if (i + j == target) {
//                    answer[0] = i;
//                    answer[1] = j;
//                    break;
//                }
//            }
//        }

        // #2
//        boolean[] tmp = new boolean[11];
//        for (int num : list) tmp[num] = true;
//        for (int i = 0; i < tmp.length; i++) {
//            if (!tmp[i]) continue;
//            if (tmp[target - i]) {
//                answer[0] = i;
//                answer[1] = target - i;
//            }
//        }

        // #3
//        int[] tmp = new int[11];
//        for (int i = 0; i < list.size(); i++) {
//            int num = list.get(i);
//            if (tmp[num] == 0) tmp[num] = i;
//        }
//        System.out.println(Arrays.toString(tmp));
//        for (int i = 0; i < tmp.length; i++) {
//            if (tmp[i] != 0) {
//                if (tmp[i] < tmp[target - i]) {
//                    answer[0] = i;
//                    answer[1] = target - i;
//                } else {
//                    answer[0] = target - i;
//                    answer[1] = i;
//                }
//                break;
//            }
//        }

        // #4
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            int b = target - a;

            if (hashMap.containsKey(b)) {
                answer[0] = b;
                answer[1] = a;
                break;
            }
            hashMap.put(a, i);
        }

        System.out.println(Arrays.toString(answer));
    }
}

