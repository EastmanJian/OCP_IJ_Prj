package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of notifyAll() vs notify() in multi-threading.
 * Producer: every 5 seconds produces 9 numbers (1~9) to the stack in a batch, then notify the Consumers.
 */
public class Producer extends Thread {
    private MyStack2 stack;
    public Producer(MyStack2 stack) {
        this.stack = stack;
    }
    public void run() {
        while(true) {
            for (int i=1 ; i<=9 ; i++) {
                stack.push(i);
                System.out.println("Producer: Just pushed " + i);
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e) {}
            }
            synchronized(stack) {
                System.out.println("Producer: Notifying...");
                stack.notifyAll(); //check the output difference if we use notifyAll() or notify() here;
            }
            try {
                Thread.sleep(5000);
            }catch(InterruptedException e) {}
        }
    }
}

