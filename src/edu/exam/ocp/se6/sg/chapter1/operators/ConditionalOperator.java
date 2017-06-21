package edu.exam.ocp.se6.sg.chapter1.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 6;
        System.out.println( x != 0 ? 10/x : 0); // -> 1

        double d = 0.36;
        System.out.println( d > 0 && d < 1 ? d *= 100 : "not a percent"); // -> 36.0

//        d > 0 && d < 1 ? System.out.println("true") : System.out.println("false"); //Compile Error: not a statement.
    }
}
