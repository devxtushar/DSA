package hashing;

import java.util.*;

public class HashmapOp { // Hashmap has undefined order
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert o(1)
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);

        // Iterate on Keys

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value" + hm.get(k));
        }
        System.out.println(hm);

        // // Get O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // // containsKey - o(1)

        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("Indonesia")); // false

        // remove - o(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size

        System.out.println(hm.size());

        // clear

        hm.clear();

        // isEmpty

        System.out.println(hm.isEmpty());

        //

    }

}
