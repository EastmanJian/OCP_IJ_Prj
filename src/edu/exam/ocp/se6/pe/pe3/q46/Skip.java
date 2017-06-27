package edu.exam.ocp.se6.pe.pe3.q46;

public class Skip {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Jump());
        Thread t2 = new Thread(new Jump());
        t1.start(); t2.start();
        t1.join(500);
        new Jump().run();
    }
}

/* sample output ->
9-0 10-0 10-1 9-1 9-2 10-2 1-0 9-3 10-3 1-1 9-4 10-4 1-2 1-3 1-4
*/