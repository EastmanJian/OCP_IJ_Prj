package edu.exam.ocp.se6.sg.chapter5.thread.init;

/**
 * Example of stopping a thread
 */
public class MyThread extends Thread {
    private String message;
    private boolean keepGoing;

    public MyThread(String m) {
        message = m;
        keepGoing = true;
    }

    public void setKeepGoing(boolean b) {
        keepGoing = b;
    }

    public void run() {
        while (keepGoing) {
            System.out.print(message + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("gone !");
    }
}