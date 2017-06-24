package edu.exam.ocp.se6.pe.pe2.q16;

public class Stubborn implements Runnable {
    static Thread t1;
    static int x = 5;

    public void run() {
        if (Thread.currentThread().getId() == t1.getId()) shove();
        else push();
    }

    static synchronized void push() { //t1 and the anonymous thread are different objects, synchronized method here cannot take effect. Hence it won't cause deadlock.
        shove();
    }

    static void shove() {
        synchronized (Stubborn.class) {  //using Stubborn class object's monitor lock
            System.out.print(x-- + "(" + Thread.currentThread().getId() + ") ");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                ;
            }
            if (x > 0) push(); //recursive call in the synchronized block
        }
    }

    public static void main(String[] args) {
        t1 = new Thread(new Stubborn());
        System.out.println("t1 thread id="+t1.getId());
        t1.start();
        new Thread(new Stubborn()).start();
    }
}

/* sample output 1 ->
t1 thread id=9
5(9) 4(9) 3(9) 2(9) 1(9) 0(10)
*/

/* sample output 2 ->
t1 thread id=9
5(10) 4(10) 3(10) 2(10) 1(10) 0(9)
*/
