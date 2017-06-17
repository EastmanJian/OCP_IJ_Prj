package edu.exam.ocp.se6.sg.chapter7.collection.comparable;

/**
 * compares "Hello" to "goodbye" and outputs - 31 because H is uppercase and appears before all lowercase letters.
 * Therefore, "Hello" is less than "goodbye". Similarly, "hello" is greater than "Hello", which outputs 32.
 */
public class NaturalOrdering {
    public static void main(String[] args) {
        String a = "hello";
        String b = "goodbye";
        String c = "Hello";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(a));
    }
}

/*
1
-31
32
0
*/