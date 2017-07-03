package edu.exam.ocp.se6.sg.chapter2.nested.Anon;

/**
 * Translate an Anonymous Inner Class back to a local inner class, which extends an existing class.
 */
public class AnonInnerBackToInner {
    public int x = 10;

    public void printX() {
        final String s = "x = ";

/*
        //anonymous inner class
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    System.out.println(s + x);
                }
            }
        };  //The semicolon here denotes the end of the new statement.
*/

        //translate the above anonymous inner class back to a local inner class
        class Anonymous extends Thread {
            public void run() {
                while (true) {
                    System.out.println(s + x);
                }
            }
        }
        Thread t = new Anonymous();

        t.start();
    }

    public static void main(String[] args) {
        new AnonInnerBackToInner().printX();
    }
}
/* ->
x = 10
x = 10
x = 10
...
*/