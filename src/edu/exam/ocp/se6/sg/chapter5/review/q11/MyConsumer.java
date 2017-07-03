package edu.exam.ocp.se6.sg.chapter5.review.q11;

public class MyConsumer extends Thread {
    private StringBuffer sb;

    public MyConsumer(StringBuffer sb) {
        this.sb = sb;
    }

    public void run() {
        if (sb != null && sb.length() == 0) {
            try {
                System.out.println("Waiting");
                sb.wait(); //runtime exception ...IllegalMonitorStateException...
/* correct way:
                synchronized (sb) {
                    sb.wait();
                }
*/
            } catch (InterruptedException e) {
            }
        }
        sb.reverse();
    }
}