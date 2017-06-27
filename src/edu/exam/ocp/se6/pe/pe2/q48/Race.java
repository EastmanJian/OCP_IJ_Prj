package edu.exam.ocp.se6.pe.pe2.q48;

public class Race {
    public static void main(String[] args) {
        Horse h = new Horse();
        Thread t1 = new Thread(h, "Andi");
        Thread t2 = new Thread(h, "Eyra");
        new Race().go(t2);
        t1.start();
        t2.start();
    }

    static String say() {
        return "fathersaid ";
    }

    void go(Thread t) {
        t.start();
    }
}

