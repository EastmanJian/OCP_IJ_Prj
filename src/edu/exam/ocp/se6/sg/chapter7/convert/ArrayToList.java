package edu.exam.ocp.se6.sg.chapter7.convert;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        //using an array as argument
        String[] array = {"one", "two", "three"};
        List<String> list = Arrays.asList(array);
        list.set(1, "four"); //alters the list also alters the array
        for (String s : array) {
            System.out.print(s + " ");
        }

        System.out.println();

        //using variable-length arguments
        List<Integer> numbers = Arrays.asList(8, 6, 7, 5, 3, 0, 9);
        for (int i : numbers) { //auto unboxing
            System.out.print(i + " ");
        }
    }
}

/* ->
one four three
8 6 7 5 3 0 9
*/