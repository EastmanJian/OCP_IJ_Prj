package edu.exam.ocp.se6.pe.pe3.q25;

public class Stone implements Runnable {
    static int id = 1;

    public void run() {
        try {
            id = 1 - id;
            if (id == 0) {
                pick();
            } else {
                release();
            }
        } catch (Exception e) {
        }
    }

    private static synchronized void pick() throws Exception {
        System.out.print("P "); System.out.print("Q ");
    }

    private synchronized void release() throws Exception {
        System.out.print("R "); System.out.print("S ");
    }

    public static void main(String[] args) throws InterruptedException {
        /**
         * pick() is static but release() is non-static,
         * pick()'s monitor lock is on object Stone.class,
         * release()'s monitor lock is on object st.
         * possible outputs are:
         *     P Q R S
         *     P R Q S
         *     P R S Q
         * If both pick() and release() are static or non-static, the output will always be:
         *     P Q R S
         */
        Stone st = new Stone();
        Thread t1 = new Thread(st); t1.start();
        Thread t2 = new Thread(st); t2.start();

        t1.join(); t2.join();
        System.out.println();

        /**
         * There are two Stone objects,
         * if both pick() and release() are non-static, the methods are not synchronized.
         * possible outputs are:
         *     P Q R S
         *     P R Q S
         *     P R S Q
         * But if both pick() and release() are static, they use the same monitor lock Stone.class, they are synchronized.
         * The output is:
         *     P Q R S
         */
        new Thread(new Stone()).start();
        new Thread(new Stone()).start();
    }
}