package edu.exam.ocp.se6.pe.pe1.q31;

/**
 * A thread inherits its priority from the thread that started it.
 * In the example below, t3 inherits its priority from t1 (priority=1), t4 inherits its priority from t2 (priority=9).
 */
class Jiggy extends Thread {
    Jiggy(String n) { super(n); }
    public void run() {
        for(int i = 0; i < 100; i++) {
            if("t1".equals(Thread.currentThread().getName()) && i == 5) {
                new Jiggy("t3").start();
                throw new Error();
            }
            if("t2".equals(Thread.currentThread().getName()) && i == 5) {
                new Jiggy("t4").start();
                throw new Error();
            }
            System.out.println(Thread.currentThread().getName() + "-Priority" + Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Jiggy("t1");
        Thread t2 = new Jiggy("t2");
        t1.setPriority(1); t2.setPriority(9);
        t2.start(); t1.start();
    } }

/* sample output ->
t2-Priority9
t2-Priority9
t2-Priority9
t1-Priority1
t2-Priority9
t1-Priority1
t2-Priority9
t1-Priority1
Exception in thread "t2" java.lang.Error
    at edu.exam.ocp.se6.pe.pe1.q31.Jiggy.run(Jiggy.java:13)
t1-Priority1
t4-Priority9
t4-Priority9
t4-Priority9
t1-Priority1
t4-Priority9
Exception in thread "t1" java.lang.Errort
    at edu.exam.ocp.se6.pe.pe1.q31.Jiggy.run(Jiggy.java:9)
t4-Priority9
t4-Priority9
t3-Priority1
t4-Priority9
t4-Priority9
t4-Priority9
t3-Priority1
t4-Priority9
t4-Priority9
t4-Priority9
.
.
.
t3-Priority1
t3-Priority1
t3-Priority1
*/