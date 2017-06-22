package edu.exam.ocp.se6.sg.chapter7.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert a List to an Array
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        String[] array = list.<String>toArray(new String[0]);
        for (String s : array) {
            System.out.print(s + " ");
        }

        //changing the list won't affect the array.
        System.out.println();
        list.set(1, "four");
        for (String s : array) {
            System.out.print(s + " ");
        }

        //changing the array won't affect the list.
        System.out.println();
        array[1] = "five";
        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}

/* ->
one two three
one two three
one four three
*/