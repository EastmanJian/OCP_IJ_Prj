package edu.exam.ocp.se6.pe.pe1.q10;

class Paratrooper implements Runnable {
    public void run() {
        System.out.print(Thread.currentThread().getName() + " ");
    }
}
