package edu.exam.ocp.se6.sg.chapter3.exception;

public class CheckedDemo {
    public void method1() {
        System.out.println("Inside method1");
        try {
            method2();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void method2() throws ClassNotFoundException {
        System.out.println("Inside method2");
        method3();
    }
    public void method3() throws ClassNotFoundException {
        System.out.println("Inside method3");
        Class c = Class.forName("java.lang.String");
        System.out.println("class name: " + c.getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new CheckedDemo().method1();
        System.out.println("End of main");
    }
}

/*
Inside main
Inside method1
Inside method2
Inside method3
class name: java.lang.String
End of main
*/