package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of deadlock
 */
public class Teller extends Thread {
    private BankAccount src, dest;

    public Teller(BankAccount src, BankAccount dest) {
        this.src = src;
        this.dest = dest;
    }

    public void run() {
        synchronized (src) {
            Thread.yield();
            synchronized (dest) {
                src.withdraw(50.00);
                dest.deposit(50.00);
            }
        }
    }
}