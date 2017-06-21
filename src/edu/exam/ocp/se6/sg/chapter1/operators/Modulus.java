package edu.exam.ocp.se6.sg.chapter1.operators;

public class Modulus {
    public static void main(String[] args) {
        int x = 12 % 5;
        int y = -17 % 4; //If the first operand is negative, so is the result of the modulus.
        System.out.println(x + ", " + y);
        System.out.println(12.4 % 3.2); //Java can evaluate the remainder of floating-point numbers as well.
    }
}

/* ->
2, -1
2.8
*/