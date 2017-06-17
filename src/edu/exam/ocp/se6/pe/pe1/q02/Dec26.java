package edu.exam.ocp.se6.pe.pe1.q02;

/**
 * Autoboxing and unboxing
 * 1) code written before Java 5 shouldn’t be affected by new Java features like
 * autoboxing, therefore widening is preferred to boxing, producing "i".
 * 2) you can’t widen from one wrapper to another. e.g. Integer can't be widen to Long.
 */
public class Dec26 {
    public static void main(String[] args) {
        short a1 = 6;
        long l = 1000;
        new Dec26().go(a1);
        new Dec26().go(new Integer(7));

    }

    void go(Short x) {
        System.out.print("S ");
    }

    void go(Long x) {
        System.out.print("L ");
    }

    void go(int x) {
        System.out.print("i ");
    }

//    void go(short s) {
//        System.out.print("s ");
//    }

    void go(Number n) {
        System.out.print("N ");
    }

//    void go(Integer i) {
//        System.out.print("I ");
//    }
}

/* -->
i N
*/