package edu.exam.ocp.se6.sg.chapter7.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert a List to an Array
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        String[] array = list.<String>toArray(new String[0]);
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}

/* ->
one two three
*/