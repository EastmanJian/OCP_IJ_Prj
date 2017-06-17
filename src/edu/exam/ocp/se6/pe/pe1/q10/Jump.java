package edu.exam.ocp.se6.pe.pe1.q10;

public class Jump {
    static Paratrooper p;

    static {
        p = new Paratrooper();
    }

    {
        Thread t1 = new Thread(p, "bob");
        t1.start();
    }

    public static void main(String[] args) {
        new Jump();
        new Thread(new Runnable() {
            public void run() {
                ;
            }
        }, "carol").start();
        new Thread(new Paratrooper(), "alice").start();
    }

    Jump() {
        Thread t2 = new Thread(p, "ted");
        t2.start();
    }

}