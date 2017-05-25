package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example: problem without synchronization.
 * It is possible that data in the stack will be corrupted because the concurrent access of two threads.
 */
public class PusherTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Pusher one = new Pusher(stack);
        Pusher two = new Pusher(stack);
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
/*
sample output -> 1 2 2 3 3 4 4 5 5 0
A '1' is missing due to concurrent access to the stack.

The problem is that when an int is pushed onto the stack, both the values array and the
index need to be updated in an atomic manner (without being interrupted). By yielding in
the middle of a push, the stack is left in an invalid state. When the 1 is pushed on the stack
by the first thread, the following statement executes:
values[0] = 1;
Before the thread can increment index by 1, it yields to the second thread, which
immediately pushes a 1 onto the stack also. But index is still 0, so the second thread
executes the same statement:
values[0] = 1;
At this point in the program, the array data has been corrupted because both threads
pushed a 1 onto the first element in the stack. The problem is that the second thread should
not have been allowed to invoke the push method of the MyStack object while the first
thread was in the middle of a push. These two threads need to be synchronized.
*/

