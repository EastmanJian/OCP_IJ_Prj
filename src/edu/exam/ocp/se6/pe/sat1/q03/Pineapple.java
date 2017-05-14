package edu.exam.ocp.se6.pe.sat1.q03;

class Pineapple implements Runnable {
    public void run() {
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        Pineapple pine = new Pineapple();

        Thread t1 = new Thread( pine );
        t1.start();
    }
}
