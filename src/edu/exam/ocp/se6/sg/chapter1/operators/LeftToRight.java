package edu.exam.ocp.se6.sg.chapter1.operators;

/**
 * operations is evaluated left-to-right when operators share the same precedence.
 */
public class LeftToRight {
    public static void main(String[] args) {
        String x = 12 - 6 + "Hello" + 7 + 5;
        System.out.println(x); //output: 6Hello75
    }
}
