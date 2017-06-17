package edu.exam.ocp.se6.sg.chapter7.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Example of Comparable sorting for String
 *
 * String objects is lexicographical, meaning that the first different character in two String objects determines
 * the ordering.
 *
 * "hello" and "hellothere" do not contain a different character to determine their order, "hello" comes first
 * because it is the shorter String.
 */
public class StringSorter {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hEllo";
        String s3 = "hellothere";
        List<String> list = new ArrayList<String>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

/* ->
hEllo
hello
hellothere
*/