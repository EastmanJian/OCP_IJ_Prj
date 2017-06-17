package edu.exam.ocp.se6.sg.chapter3.exception;

public class ExceptionDemo {
    public void method1() {
        System.out.println("Inside method1");
        method2();
    }
    public void method2() {
        System.out.println("Inside method2");
        method3();
    }
    public void method3() {
        System.out.println("Inside method3");
        int x = 5, y = 0;
        int z = x/y; //throws an ArithmeticException
        System.out.println("z = " + z);
    }
    public static void main(String [] args) {
        System.out.println("Inside main");
        new ExceptionDemo().method1();
        System.out.println("End of main");
    }
}

/*
Inside main
Inside method1
Inside method2
Inside method3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at edu.exam.ocp.se6.sg.chapter3.exception.ExceptionDemo.method3(ExceptionDemo.java:15)
        at edu.exam.ocp.se6.sg.chapter3.exception.ExceptionDemo.method2(ExceptionDemo.java:10)
        at edu.exam.ocp.se6.sg.chapter3.exception.ExceptionDemo.method1(ExceptionDemo.java:6)
        at edu.exam.ocp.se6.sg.chapter3.exception.ExceptionDemo.main(ExceptionDemo.java:20)
*/
