package edu.exam.ocp.se6.sg.chapter5.thread.init;

/**
 * Created by jiany on 2017-5-23.
 */
public class SayHello implements Runnable {
    private String greeting;

    public SayHello(String greeting) {
        this.greeting = greeting;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(greeting);
            Thread.yield();
        }
        System.out.println("End of run");
    }
}