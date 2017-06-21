package edu.exam.ocp.se6.sg.chapter1.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int result = 12 ^ 45; // result = 33
        /**
           12    = 0000 1100
           45    = 0010 1101
           -------------------
           12^45 = 0010 0001 = 33
         */

        int a = 5, b = 10, c = 0;
        boolean one = a < b & c != 0;
        System.out.println("one = " + one);  // -> false

        boolean two = true | true & false;  //The & operator has a higher precedence than |.
        System.out.println("tow = " + two); // -> true

        boolean four = true ^ true & false;  //The & operator has a higher precedence than ^.
        System.out.println("four = " + four); // -> true

        boolean five = true | false ^ true;  //The ^ operator has higher precedence than |
        System.out.println("five = " + five); // -> true

        boolean three = (c != 0) & (a / c > 1); //runtime exception: ArithmeticException: / by zero,
                                                //bitwise logical operator & will not do short-circuit, not like &&.
                                                //hence both (c != 0) and (a / c > 1) are evaluated, result in runtime exception.
        System.out.println("three = " + three);

    }
}
