package edu.exam.ocp.se6.pe.pe3.q42;

class Wanderer implements Runnable {
    public void run() {
        for (int i = 0; i < 2; i++)
            System.out.print(Thread.currentThread().getName() + " ");
    }

    public static void main(String[] args) {
        Wanderer w = new Wanderer();
        Thread t1 = new Thread();
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w, "fred");
        t1.start(); //compiles fine and runs fine.
        t2.start();
        t3.start();
    }
}

/* possible outputs:
Thread-1 Thread-1 fred fred
Thread-1 fred Thread-1 fred
...
*/
