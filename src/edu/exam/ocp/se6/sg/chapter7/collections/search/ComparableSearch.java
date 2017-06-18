package edu.exam.ocp.se6.sg.chapter7.collections.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //Integer implements Comparable interface
        for (int i = 1; i <= 20; i++) {
            int x = (int) (Math.random() * 10);
            list.add(x);
        }
        Collections.sort(list); //comment this line to test if the list is not sorted
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        int index = Collections.binarySearch(list, new Integer(5));
        if (index >= 0) {
            System.out.println("5 found at index " + index);
        } else {
            System.out.println("5 not found. index = " + index);
        }
    }
}

/* sample output ->
0 0 0 0 0 1 1 2 2 2 3 3 4 5 5 7 7 7 7 9
5 found at index 14
*/

/* sample out if the list is not sorted
7 4 5 5 9 8 7 7 3 1 9 3 4 9 7 3 6 5 3 4
5 not found. index = -14
*/

/* another sample out if the list is not sorted
8 1 8 6 1 7 9 6 1 7 7 3 1 4 7 8 5 7 4 2
5 not found. index = -6
*/