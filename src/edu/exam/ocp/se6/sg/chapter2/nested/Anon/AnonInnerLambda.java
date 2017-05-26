package edu.exam.ocp.se6.sg.chapter2.nested.Anon;

/**
 * Example of replacing Anonymous Inner Class with lambda expression
 */
public class AnonInnerLambda {
    public int x = 10;

    public void printX() {
        final String s = "x = ";
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println(s + x);
            }
        });  //The semicolon here denotes the end of the new statement.
        t.start();
    }

    public static void main(String[] args) {
        new AnonInnerLambda().printX();
    }
}


