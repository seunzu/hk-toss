package stackQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int p = stack.pop();
        System.out.println(p);
        System.out.println(stack.size());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.size());
        int q1 = queue.poll();
        System.out.println(q1 + " " + queue.size());
        int q2 = queue.peek();
        System.out.println(q2 + " " + queue.peek());
    }
}
