package edu.exam.ocp.se6.pe.pe1.q39;

import java.util.*;

/**
 * If you use Comparable binarySearch, the array should be sorted using Comparable or Comparator with the same ordering.
 * If you only sort the array by Comparator with a different ordering but use Comparable binarySearch, the result will
 * be undefined (-1).
 */
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
            return b.compareTo(a); //reverse order
//            return a.compareTo(b); //same order as Comparable
        }
    }
}

/* reverse order in Comparator ->
vail t-ride dillon aspen
-1
2
*/

/* The Comparator uses the same order as Comparable ->
aspen dillon t-ride vail
1
1
*/