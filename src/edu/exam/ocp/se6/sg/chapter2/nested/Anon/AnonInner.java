package edu.exam.ocp.se6.sg.chapter2.nested.Anon;

/**
 * Example of Anonymous Inner Class, which extends an existing class.
 */
public class AnonInner {
    public int x = 10;

    public void printX() {
        final String s = "x = ";
        Thread t = new Thread() { //can be replaced with constructor accepting lambda in Java 1.8.
            public void run() {
                while (true) {
                    System.out.println(s + x);
                }
            }
        };  //The semicolon here denotes the end of the new statement.
        t.start();
    }

    public static void main(String[] args) {
        new AnonInner().printX();
    }
}


