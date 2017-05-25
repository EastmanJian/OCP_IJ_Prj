package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of notify() in multi-threading.
 */
public class Producer0 extends Thread {
    private MyStack2 stack;
    public Producer0(MyStack2 stack) {
        this.stack = stack;
    }
    public void run() {
        while(true) {
            int random = (int) (Math.random() * 5);
            stack.push(random);
            System.out.println("Producer: Just pushed " + random);
            synchronized(stack) {
                System.out.println("Producer: Notifying...");
                stack.notify();
            }
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e) {}
        }
    }
}