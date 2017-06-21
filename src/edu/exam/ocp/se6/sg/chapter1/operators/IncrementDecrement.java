package edu.exam.ocp.se6.sg.chapter1.operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x++); // -> 6
        System.out.println(x); // -> 7

        char c = 'A';
        for (int i = 1; i <= 10; i++) {
            System.out.print(c++ + " "); // -> A B C D E F G H I J
        }
        System.out.print(c); // -> K

        int y = 5;
        int result = y-- * 3 / --y;
        System.out.println("y = " + y); // -> 3
        System.out.println("result = " + result); // -> 5
        /**
         This is a tricky question! (I hope you never see code like this in the real world.)
         1. multiplication is evaluated first. The value of y is 5, so 5 * 3 is 15.
         2. The multiplication is done, so the post-decrement y-- occurs and y becomes 4.
         3. y is pre-decremented (--y) to 3 before the division
         4. the division is evaluated,  15 / 3, which is 5.
         */
    }
}
