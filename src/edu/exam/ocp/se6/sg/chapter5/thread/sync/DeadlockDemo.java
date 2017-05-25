package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of deadlock
 *
 * Here is what happens: the deposit of $100.00 is successfully made on BankAccount a,
 * but the two Teller threads deadlock before any other output occurs. The t1 thread grabs
 * the lock on a, then yields. The t2 thread grabs the lock on b, then yields. The t1 thread
 * now attempts to acquire the b lock, but t2 owns it, so t1 becomes blocked. The t2 thread
 * attempts to acquire the a lock, but t1 owns it so t2 becomes blocked. Neither thread will
 * ever become runnable again because the locks they are waiting for will never be freed. In
 * addition, the main thread of the DeadlockDemo program is also blocked forever because it
 * called join on both t1 and t2, and neither of those two threads can run to completion.
 */
public class DeadlockDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(100.00);
        BankAccount b = new BankAccount();
        Teller t1 = new Teller(a, b);
        Teller t2 = new Teller(b, a);
        t1.start();
        t2.start();
        System.out.println("t1 priority=" + t1.getPriority());
        System.out.println("t2 priority=" + t2.getPriority());
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }
        System.out.println("a balance = " + a.getBalance());
        System.out.println("b balance = " + b.getBalance());
    }
}