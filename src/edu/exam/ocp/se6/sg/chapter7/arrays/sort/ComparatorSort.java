package edu.exam.ocp.se6.sg.chapter7.arrays.sort;

import java.util.Arrays;

public class ComparatorSort {
    public static void main(String[] args) {
        Integer[] values = new Integer[15];
        System.out.print("Initial values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 10);
            System.out.print(values[i] + " ");
        }
        Arrays.sort(values, new EvenSorter());
        System.out.print("\nSorted values: ");
        for (int i : values) {
            System.out.print(i + " ");
        }
    }
}

/* ->
Initial values: 1 2 8 2 4 3 8 2 1 7 5 4 9 9 7
Sorted values: 1 3 1 7 5 9 9 7 2 8 2 4 8 2 4
*/