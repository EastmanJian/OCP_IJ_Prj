package edu.exam.ocp.se6.sg.chapter1.operators;

public class OperandsPromote {
    public static void main(String[] args) {
        byte b1 = 40, b2 = 50;
//        byte sumbyte = (byte) b1 + b2; //does not compile! because at minimum, the operands are promoted to ints

        short s1 = 10, s2 = 12;
//        short sum = s1 + s2; //does not compile! because at minimum, the operands are promoted to ints
        short sum = (short) (s1 + s2); //use cast to avoid compile error

        int a = 26, b = 5;
        double d = a / b; //d is 5.0, because a / b is int, we store the result in a double does not affect the arithmetic because the assignment takes place after the arithmetic is already performed.

        int n = 26;
        float f = n / 5.0F; //f is 5.2, n is promoted to float
    }
}
