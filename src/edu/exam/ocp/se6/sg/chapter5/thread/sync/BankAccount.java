package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of synchronized block.
 *
 * A thread that needs to access a BankAccount object should obtain its monitor lock first.
 * On the line 'synchronized (account) ...' the current thread attempts to acquire the lock on a BankAccount object
 * using its reference.
 *
 * On line 'synchronized (account)...', the current thread attempts to acquire the lock on a BankAccount object using
 * its reference. It has two possible outcomes:
 *  - The lock is available and the current thread becomes the owner of the lock. the statements in the synchronized
 *  block execute and then the lock is released after the block.
 *  - The lock is not available and the current thread becomes blocked. The thread does not become runnable again until
 *  the lock becomes available.
 *
 *  The getBalance method is invoked outside of synchronized code, which might be acceptable because the method does
 *  not alter any data in the fields. However, it is not uncommon for a “get” method to be invoked within synchronized
 *  code.
 */

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        System.out.println("Making a deposit: " + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("Making a withdrawal: " + amount);
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void doSomeBanking(BankAccount account) {
        synchronized (account) {
            account.deposit(50.00);
            account.withdraw(20.00);
        }
        System.out.println(account.getBalance());
    }

    public static void main(String[] args) {
        BankAccount.doSomeBanking(new BankAccount());
    }
}

/* ->
Making a deposit: 50.0
Making a withdrawal: 20.0
30.0

*/