package edu.exam.ocp.se6.sg.chapter2.nested.Anon;

/**
 * Example of replacing Anonymous Inner Class with lambda expression
 */
public class AnonInnerLambda1 {
    public int x = 10;

    public void printX() {
        final String s = "x = ";
        Runnable t = () -> {
            while (true) {
                System.out.println(s + x);
            }
        };
        new Thread(t).start();
    }

    public static void main(String[] args) {
        new AnonInnerLambda1().printX();
    }
}


