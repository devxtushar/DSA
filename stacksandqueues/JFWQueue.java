package stacksandqueues;

import java.util.*;

public class JFWQueue {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); // array deque or linkedlist class can
        // only create queue because queue is
        // a interface and we never create a object of an interface. // o(1) on both for
        // all three operations

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
