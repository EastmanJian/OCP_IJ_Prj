package edu.exam.ocp.se6.pe.pe2.q34;


public class Basket extends Holder {
    public static void main(String[] args) {
        short s = 7;
        long l = 9L;
        float f = 4.0f;
        int i = 3;
        char c = 'c';
        byte b = 5;
        switch (Gas.ARGON) {//you can use s, i, c, b in the switch here.
            default:
                System.out.println("howdy");
        }
    }
}
/* ->
howdy
*/