package edu.exam.ocp.se6.pe.pe4.q15;

public class Argue {
    static boolean b;
    static int x = 0;

    public static void main(String[] args) {
        int guess = (int) (Math.random() * 5);
        if (guess < 0) assert false;
        assert b = true;
//        assert x = 0;
        assert x == 0;
    }
}