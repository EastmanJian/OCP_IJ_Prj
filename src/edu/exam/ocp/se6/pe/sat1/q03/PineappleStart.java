package edu.exam.ocp.se6.pe.sat1.q03;

class PineappleStart implements Runnable {
    public void run() {
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread( new PineappleStart() );
        t1.start();
    }
}
