package edu.exam.ocp.se6.sg.chapter1.operators;

public class InstanceofOperator {
    public static void main(String[] args) {
        String s = "Hello, World";
        if (s instanceof String) {
            System.out.print("one");
        }
        if (s instanceof Object) {
            System.out.print("two");
        }
        if (s instanceof java.io.Serializable) {
            System.out.print("three");
        }
    }
}

/* ->
onetwothree
*/