package edu.exam.ocp.se6.pe.pe3.q09;

public class Q09 {
    public static void main(String[] args) {
        int x = 3;
        for(int i = 0; i < 3; i++) {
            if(i == 1) x = x++;
            if(i % 2 == 0 && x % 2 == 0) System.out.print(".");
            if(i % 2 == 0 && x % 2 == 1) System.out.print("-");
            if(i == 2 ^ x == 4) System.out.print(",");
        }
        System.out.println("<"); // -> --,<


        x = 3;
        System.out.println(x++); // -> 3
        System.out.println(x); // -> 4

        x = 3;
        x = x++;
        System.out.println(x); // -> 3
                               // Because "x++" is evaluated as 3 first in the expression.
                               // Then x is self increased to 4.
                               // After that, expression 3 is assigned back to x.

        x = 3;
        x = ++x;
        System.out.println(x); // -> 4
    }
}
