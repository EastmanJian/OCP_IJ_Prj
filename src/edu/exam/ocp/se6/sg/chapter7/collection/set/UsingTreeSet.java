package edu.exam.ocp.se6.sg.chapter7.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Example of NavigableSet Interface and TreeSet
 */
public class UsingTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for (int i = 1; i <= 20; i++) {
            tree.add(i);
        }
        Integer ceiling = tree.ceiling(10);
        System.out.println("ceiling of 10 = " + ceiling);
        Integer higher = tree.higher(10);
        System.out.println("floor of 10 = " + higher);
        NavigableSet<Integer> subset = tree.subSet(new Integer(7), false,
                new Integer(14), true);
        for (Integer x : subset) {
            System.out.print(x + " ");
        }
    }
}

/* ->
ceiling of 10 = 10
floor of 10 = 11
8 9 10 11 12 13 14
*/