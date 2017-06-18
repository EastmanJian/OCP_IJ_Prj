package edu.exam.ocp.se6.sg.chapter7.arrays.sort;

import java.util.Arrays;

public class PrimitiveSort {
    public static void main(String[] args) {
        int[] values = new int[15];
        System.out.print("Initial values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 10);
            System.out.print(values[i] + " ");
        }
        Arrays.sort(values);
        System.out.print("\nSorted values: ");
        for (int i : values) {
            System.out.print(i + " ");
        }
    }
}

/* ->
Initial values: 3 8 8 4 6 2 8 8 3 3 2 9 1 2 5
Sorted values: 1 2 2 2 3 3 3 4 5 6 8 8 8 8 9
*/
