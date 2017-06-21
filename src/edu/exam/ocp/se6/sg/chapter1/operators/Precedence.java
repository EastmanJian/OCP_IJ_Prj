package edu.exam.ocp.se6.sg.chapter1.operators;

public class Precedence {
    public static void main(String[] args) {
        int result = 12 + 2 * 5 % 3 - 15 / 4;
        /** Here is how the expression is evaluated one level of precedence at a time.
        12 + (2 * 5) % 3 - (15 / 4)
            12 + (10 % 3) - 3
               (12 + 1) - 3
                13 - 3
                  10
         */
        System.out.println(result); // -> 10

        System.out.println(5 % 3 * 2); // -> 4, % and * has the same level of precedence.
    }
}
