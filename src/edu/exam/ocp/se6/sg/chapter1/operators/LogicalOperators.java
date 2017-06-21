package edu.exam.ocp.se6.sg.chapter1.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean one = true || true && false;  //The && operator has a higher precedence than ||.
        System.out.println("one = " + one); // -> one = true

        int a = 5, b = 10, c = 0;
        boolean three = (c != 0) && (a / c > 1); //short-circuit, because (c != 0) is false, (a / c > 1) is not evaluated.
        System.out.println("three = " + three); // -> three = false

        int x = 6;
        boolean answer = (x >= 6) || (++x <= 7); //short-circuit, because (x >= 6) is true, (++x <= 7) is not evaluated.
        System.out.println("answer=" + answer + ", x=" + x); // -> answer=true, x=6
    }
}
