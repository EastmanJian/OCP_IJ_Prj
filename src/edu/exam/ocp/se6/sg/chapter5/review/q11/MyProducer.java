package edu.exam.ocp.se6.sg.chapter5.review.q11;

public class MyProducer {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer("");
        MyConsumer consumer = new MyConsumer(sb);
        consumer.start();
        Thread.yield();
        Thread.sleep(200);
        sb.append("abc");
        synchronized (sb) {
            sb.notifyAll();
        }
        Thread.yield();
        Thread.sleep(200);
        System.out.println(sb); // if MyConsumer synchronized the statement sb.wait() -> cba
    }
}