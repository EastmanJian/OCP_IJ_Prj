package edu.exam.ocp.se6.pe.pe4.q13;

public class BigData {
    static BigData bd;

    public static void main(String[] args) throws InterruptedException {
        new BigData().doStuff();
        System.gc(); //the object above is not GCed because bd is still pointing to the object.
        Thread.sleep(1000);

        bd.doStuff();
        bd = null; //the BigData object is eligible for GC. And finalize() will not be called again.

        System.gc();
        Thread.sleep(1000);
    }

    void doStuff() {
        System.out.println("do something.");
    }

    protected void finalize() {
        bd = this; //cause this BigData object cannot be GCed until reference bd is not pointing to this object anymore.
        System.out.println("to be GCed.");
    }
}