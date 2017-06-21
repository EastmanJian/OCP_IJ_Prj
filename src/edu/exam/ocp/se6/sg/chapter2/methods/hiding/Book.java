package edu.exam.ocp.se6.sg.chapter2.methods.hiding;

/**
 * Example of method hiding
 */
public class Book {
    private static int counter = 0;
    public static int getCounter() {
        System.out.println("Inside Book");
        return ++ counter;
    }
}