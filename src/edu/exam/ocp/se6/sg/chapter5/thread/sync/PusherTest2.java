package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of thread synchronization.
 * A fix of the problem at class PusherTest
 */
public class PusherTest2 {
    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        Pusher2 one = new Pusher2(stack);
        Pusher2 two = new Pusher2(stack);
        one.start();
        two.start();
        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
        }
        System.out.println(stack.toString());
    }
}

// -> 1 1 2 2 3 3 4 4 5 5