package edu.exam.ocp.se6.sg.chapter1.operators;

public class LossPrecisionCast {
    public static void main(String[] args) {
        byte b1 = 60, b2 = 60;
        byte product = (byte) (b1 * b2);
        System.out.println(product); //output 16, loss of precision.
    }
}