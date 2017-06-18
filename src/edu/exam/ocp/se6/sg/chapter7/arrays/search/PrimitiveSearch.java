package edu.exam.ocp.se6.sg.chapter7.arrays.search;

import java.util.Arrays;

public class PrimitiveSearch {
    public static void main(String[] args) {
        long[] values = {432432L, 2342323L, 1244L, 89349L, 7898239L};
        Arrays.sort(values);
        long key = 432432L;
        int index = Arrays.binarySearch(values, key);
        System.out.println(key + " found at index " + index);
        long key2 = 55555L;
        int index2 = Arrays.binarySearch(values, key2);
        System.out.println(key2 + " found at index " + index2);
    }
}

/* ->
432432 found at index 2
55555 found at index -2
*/