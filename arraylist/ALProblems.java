package arraylist;

import java.util.ArrayList;

public class ALProblems {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(0);
        list.add(19);
        System.out.println(list + " ");

        for (int i = list.size() - 1; i >= 0; i--) { // O(n)
            System.out.print(list.get(i) + " ");
        }

        int max = Integer.MIN_VALUE;

    }

}
