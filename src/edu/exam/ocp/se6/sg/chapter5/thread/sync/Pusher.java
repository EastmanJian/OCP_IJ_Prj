package edu.exam.ocp.se6.sg.chapter5.thread.sync;

public class Pusher extends Thread {
    private MyStack stack;

    public Pusher(MyStack stack) {
        this.stack = stack;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
    }

}