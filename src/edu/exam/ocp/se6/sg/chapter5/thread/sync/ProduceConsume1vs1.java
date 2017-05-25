package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of wait(), notify() in multi-threading.
 * One Producer and one Consumer.
 *
 * The following sequence of events occurs when the code executes:
 * 1. Assuming the Consumer thread runs first (which is only an assumption and not a guarantee), its run method is invoked.
 * 2. On Consumer line 'synchronized (stack) ...', the thread attempts to acquire the monitor lock of the stack. Again, let’s assume the lock is available.
 * 3. The Consumer pops an int off the stack. With our assumptions so far, the value returned is - 1 because the Producer0 has not had a chance to push anything onto the stack yet.
 * 4. The Consumer calls wait and gives up the monitor lock of the stack.
 * 5. The Producer0 thread is started and its run method is invoked. A random int between 0 and 4 is pushed onto the stack
 * 6. On Producer0 line 'synchronized(stack)...', the Producer0 thread attempts to acquire the lock of the stack. This step is necessary because the call to notify can only occur if the thread owns the lock on the stack.
 * 7. The Producer0 call notify method to awaken the Consumer thread and its state changes from WAITING to BLOCKED. Notice the Consumer thread is not RUNNABLE at this point in time. Why? Because the Producer0 thread still has the lock on the stack and the Consumer thread was within synchronized code when it invoked wait.
 * 8. The Producer0 thread gives up the lock of the MyStack2 object after notify, causing the Consumer thread to transition to the RUNNABLE state.
 * 9. The Producer0 thread sleeps, allowing the Consumer thread to obtain the lock of the stack and pop the recently pushed value. The stack is now empty because the Producer0 is sleeping, so the Consumer waits again.
 */
public class ProduceConsume1vs1 {
    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        Consumer c = new Consumer(0, stack);
        c.start();
        Producer0 p = new Producer0(stack);
        p.start();
    }
}
