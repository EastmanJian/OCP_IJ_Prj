package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of wait() in multi-threading.
 * Consumer: every 1 second pops a number from the stack. If the stack is empty, wait for the Producer.
 */
public class Consumer extends Thread {
    private MyStack2 stack;
    private int id;

    public Consumer(int id, MyStack2 stack) {
        this.stack = stack;
        this.id = id;
    }

    public void run() {
        while (true) {
            synchronized (stack) {
                int x = stack.pop();
                if (x == -1) {
                    try {
                        System.out.println("Consumer " + id + ": Waiting...");
                        stack.wait();
                    } catch (InterruptedException e) {
                    }
                } else {
                    System.out.println("Consumer " + id + ": Just popped " + x);
                }
            }
            Thread.yield();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}