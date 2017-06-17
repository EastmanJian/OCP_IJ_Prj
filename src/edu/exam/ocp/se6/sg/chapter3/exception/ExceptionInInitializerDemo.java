package edu.exam.ocp.se6.sg.chapter3.exception;

public class ExceptionInInitializerDemo {
    static {
        Integer x = null;
        x.intValue();
    }
    public static void main(String [] args) {
        System.out.println("Inside main");
    }
}

/* ->
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NullPointerException
        at edu.exam.ocp.se6.sg.chapter3.exception.ExceptionInInitializerDemo.<clinit>(ExceptionInInitializerDemo.java:6)
 */