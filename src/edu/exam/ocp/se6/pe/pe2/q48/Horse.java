package edu.exam.ocp.se6.pe.pe2.q48;

class Horse implements Runnable {
    public void run() {
        if (Thread.currentThread().getName().equals("Andi"))
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.print(Thread.currentThread().getName() + " ");
    }
}