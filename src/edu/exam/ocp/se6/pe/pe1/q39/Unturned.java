package edu.exam.ocp.se6.pe.pe1.q39;

import java.util.*;

public class Unturned {
    public static void main(String[] args) {
        String[] towns = {"aspen", "vail", "t-ride", "dillon"};
        MySort ms = new MySort();
        Arrays.sort(towns, ms);
        for (String s: towns) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(towns, "dillon"));
        System.out.println(Arrays.binarySearch(towns, "dillon", ms));
    }

    static class MySort implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}

/* ->
vail t-ride dillon aspen
-1
2
*/