package edu.exam.ocp.se6.sg.chapter3.assertion;

/**
 * run with java -ea
 */
public class Asserts {
    public static void main(String [] args) {
        int x = 10;
        assert x < 0;
        System.out.println("x = " + x);
    }
}
/* ->
Exception in thread "main" java.lang.AssertionError
	at edu.exam.ocp.se6.sg.chapter3.assertion.Asserts.main(Asserts.java:6)
*/