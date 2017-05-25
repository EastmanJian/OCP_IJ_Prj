package edu.exam.ocp.se6.sg.chapter5.thread.init;

/**
 * Example of stopping a thread
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("going");
        myThread.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
        }
        myThread.setKeepGoing(false);
        System.out.println("End of main");
    }
}