package edu.exam.ocp.se6.sg.chapter4.wrapper;

/**
 * (out of SG Book)
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = Integer.valueOf(4);
        System.out.println(a); // -> 4

        a = Integer.valueOf("011");
        System.out.println(a); // -> 11

        a = Integer.valueOf("011", 8);
        System.out.println(a); // -> 9

        a = Integer.valueOf("11", 8);
        System.out.println(a); // -> 9

        a = Integer.valueOf("FF", 16);
        System.out.println(a); // -> 255

        a = Integer.valueOf("0xFF", 16); // NumberFormatException at runtime
        System.out.println(a);
    }
}
