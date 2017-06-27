package edu.exam.ocp.se6.pe.pe3.q46;

class Jump implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try { Thread.sleep(200); } catch (Exception e) { System.out.print("e "); }
            System.out.print(Thread.currentThread().getId() + "-" + i + " ");
        }
    }
}