package edu.exam.ocp.se6.sg.chapter5.thread.init;

/**
 * Example, cannot exactly determine the execution steps between both threads with same priority.
 * Both the main thread and the t thread have the same priority, they will compete CPU.
 */
public class CountToTen {
    public static void main(String [] args) {
        SayHello hello = new SayHello("Hi");
        Thread t = new Thread(hello);
        t.start();
        for(int k = 1; k <= 10; k++) {
            System.out.print(k);
            Thread.yield();
        }
        System.out.println("End of main");
    }
}

/*
-> Sample output 1:
1Hi2HiHiHiHiHi3HiHiHiHi45678910End of run
End of main

-> Sample output 2:
1234567HiHiHi89HiHiHiHiHiHiHi10End of run
End of main

 */