package hashing;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedTreemap {
    public static void main(String[] args) {
        // LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // lhm.put("India", 100);
        // lhm.put("US", 50);
        // lhm.put("China", 150);
        // System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("US", 50);
        tm.put("China", 150);
        System.out.println(tm);
    }

}
