package edu.exam.ocp.se6.sg.chapter7.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Example of Comparator sorting
 */
public class ComparatorSorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(12);
        list.add(7);
        list.add(7);
        list.add(30);
        Collections.sort(list, new Reverse());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

/* ->
30
12
7
7
-5
*/