package edu.exam.ocp.se6.pe.pe1.q39;

import java.util.Arrays;
import java.util.Comparator;

/**
 * If you use Comparator binarySearch, the array should be sorted using Comparator or Comparable with the same ordering.
 * If you use Comparator binarySearch with a different ordering, the result might be undefined (negative number).
 */
public class Turned {
    public static void main(String[] args) {
        String[] towns = {"aspen", "vail", "t-ride", "dillon"};
        Arrays.sort(towns);
        for (String s: towns) {
            System.out.print(s + " ");
        }
        System.out.println();

        MySort ms = new MySort();
        System.out.println(Arrays.binarySearch(towns, "t-ride", ms));
    }

    static class MySort implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a); //reverse order
//            return a.compareTo(b); //same order as Comparable
        }
    }
}

/* reverse order in Comparator ->
aspen dillon t-ride vail
-1
*/

/* The Comparator uses the same order as Comparable ->
aspen dillon t-ride vail
2
*/