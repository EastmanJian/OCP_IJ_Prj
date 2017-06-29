package edu.exam.ocp.se6.sg.chapter5.thread.join;

public class SelfJoin implements Runnable {
    public void run() {
        System.out.println("start thread"); // -> start thread
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end thread"); //this will not print out because the thread join() itself, it just hangs there.
    }

    public static void main(String[] args) {
        Thread t = new Thread(new SelfJoin());
        t.start();
        System.out.println("end main"); // -> end main
    }
}
