package edu.exam.ocp.se6.pe.pe4.q29;

import java.util.*;

/**
 * The subSet() method returns a “backed” collection with a certain value range, from fromElement, inclusive,
 * to toElement, exclusive. Changes in the returned set are reflected in the current set, and vice-versa.
 * Attempting to add an out-of-range entry to the backed collection throws an exception.
 */
public class Corner {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();
        TreeSet<String> t2;
        t1.add("b");
        t1.add("7");
        t2 = (TreeSet) t1.subSet("5", "c");
        try {
            t1.add("d");
            t2.add("6");
            t2.add("3");
        } catch (Exception e) {
            System.out.print("ex ");
            e.printStackTrace();
        }
        System.out.println(t1 + " " + t2);
    }
}
/* ->
ex java.lang.IllegalArgumentException: key out of range
    ...
[6, 7, b, d] [6, 7, b]
*/