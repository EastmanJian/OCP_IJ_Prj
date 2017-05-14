package edu.exam.ocp.se6.pe.sat1.q03;

public class FabricStart extends Thread {
    public static void main(String[] args) {
        Thread t = new FabricStart();
        Thread t2 = new FabricStart();
        t.start();
        t2.start();
    }

    //public static void run() {  //compile error, cannot use static modifier.
    public void run() {
        for (int i = 0; i < 2; i++)
            System.out.print(Thread.currentThread().getName() + " ");
    }
}