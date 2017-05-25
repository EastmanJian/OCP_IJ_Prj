package edu.exam.ocp.se6.sg.chapter2.nested.member;

/**
 * Example of using Member Inner class out of the Outer class
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer a = new Outer();
        Outer.Inner b = a.new Inner();
    }
}
