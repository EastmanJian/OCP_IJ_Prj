package edu.exam.ocp.se6.sg.chapter1.review.q18;

public class Q18 {
    public static void main(String[] args) {
        int x = 0;
        String s = null;
/*
        if(x == s) { //Compile error: incomparable types: int and String
            System.out.println("Success");
        }
*/

        Integer i = 3;
        Double d = 3.5;
/*
        if (i == d) {//Compile error: incomparable types: Integer and Double
            System.out.println(true);
        }
*/

        double d1=3.5;
        if (d == d1) { //Compiles fine. auto unboxing
            System.out.println(true);
        }
    }
}
