package edu.exam.ocp.se6.sg.chapter5.thread.sync;

import java.sql.Timestamp;

public class DMV implements Runnable {
    public static void main(String[] args) {
        DMV d = new DMV();
        new Thread(d).start();
        Thread t1 = new Thread(d);
        t1.start();
    }

    public void run() {
        for (int j = 0; j < 4; j++) {
            do1();
            do2();
        }
    }

    void do1() {
        try {
            System.out.println(Thread.currentThread().getName() + " start do1(), " + new Timestamp(System.currentTimeMillis()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " end do1(), " + new Timestamp(System.currentTimeMillis()));
        } catch (Exception e) {
            System.out.print("e ");
        }
    }

    synchronized void do2() {
        try {
            System.out.println(Thread.currentThread().getName() + " start do2(), " + new Timestamp(System.currentTimeMillis()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " end do2(), " + new Timestamp(System.currentTimeMillis()));
        } catch (Exception e) {
            System.out.print("e ");
        }
    }
}
/*
do2() is synchonrized method, hence thread d and t1's do2() will not be executed at the same time. 
Total execution time is around 9 seconds, because after do1() is executed for both thread, only one of threads will execute do2(), 
the other thread will wait. Once the first do2() is completed, the other thread will start do2(). After that, both thread will execute 
do1() and do2() in turn.  
The execution sequence is as below.
t0 -> do1 do2 do1 do2 do1 do2 do1 do2
t1 -> do1     do2 do1 do2 do1 do2 do1 do2
*/

