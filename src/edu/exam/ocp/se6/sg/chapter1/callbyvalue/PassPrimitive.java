package edu.exam.ocp.se6.sg.chapter1.callbyvalue;

/**
 * If the argument passed into a method parameter is a primitive type, it is impossible in Java for the method to alter
 * the value of the original primitive.
 */

public class PassPrimitive {
    public static long cubic(int y) {
        long longValue = (long) y;
        y = -1;
        return longValue * longValue * longValue;
    }

    public static void main(String[] args) {
        int x = 11;
        long result = cubic(x);
        System.out.println("x = " + x);
        System.out.println("result = " + result);
    }
}

/* ->
x = 11
result = 1331
*/