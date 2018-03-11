package edu.exam.ocp.se6.sg.chapter1.gc;


/**
 * Thread GC
 */
public class ThreadGCDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("thread is running...");
                } catch (InterruptedException e) {

                }
            }
        });
        t.start();
        t = null; //though no reference is referring to the thread after this statement, it will not be GCed because thread object is in GC root.
        System.gc();
    }

}