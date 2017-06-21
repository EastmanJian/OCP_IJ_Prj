package edu.exam.ocp.se6.pe.pe1.q30;

import java.util.*;

/**
 * When put a duplicate entry into a map, If it previously contained a mapping for the key, the old value is replaced
 * by the specified value.
 *
 * The values() method does NOT  guarantee any ordering in a HashMap.
 */
public class Garage {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
        String[] k = {null, "2", "3", null, "5"};
        String[] v = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < 5; i++) {
            hm.put(k[i], v[i]);
            System.out.print(hm.get(k[i]) + " ");
        }
        System.out.print(hm.size() + " " + hm.values() + "\n");
    }
}

/* ->
a b c d e 4 [d, b, c, e]
*/