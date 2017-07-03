package edu.exam.ocp.se6.sg.chapter3.review.q17;

public class Q17 {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        System.out.println(args[3]);

        //NullPointerException
        Integer i =null;
        System.out.println(i.intValue());
    }
}
