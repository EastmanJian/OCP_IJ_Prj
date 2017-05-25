package edu.exam.ocp.se6.sg.chapter5.thread.sync;

public class Pusher2 extends Thread {
    private MyStack2 stack;

    public Pusher2(MyStack2 stack) {
        this.stack = stack;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
    }

}