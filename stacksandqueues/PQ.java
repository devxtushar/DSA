package stacksandqueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    static class Student implements Comparable<Student> {// overriding it gives power to class to compare
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;

        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(3); // o(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        // while (!pq.isEmpty()) {
        // System.out.println(pq.peek()); // o(1)
        // pq.remove(); // o(logn)
        // }
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // o(1)
            pq.remove(); // o(logn)
        }

    }

}
