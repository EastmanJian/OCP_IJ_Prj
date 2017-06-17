package edu.exam.ocp.se6.sg.chapter3.exception;

public class CheckedDemoThrows {
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
        Class c = Class.forName("java.lang.StringString");
        System.out.println("class name: " + c.getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new CheckedDemoThrows().method1();
        System.out.println("End of main");
    }
}

/*
Inside main
Inside method1
Inside method2
Inside method3
java.lang.ClassNotFoundException: java.lang.StringString
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Unknown Source)
        at edu.exam.ocp.se6.sg.chapter3.exception.CheckedDemoThrows.method3(CheckedDemoThrows.java:18)
        at edu.exam.ocp.se6.sg.chapter3.exception.CheckedDemoThrows.method2(CheckedDemoThrows.java:14)
        at edu.exam.ocp.se6.sg.chapter3.exception.CheckedDemoThrows.method1(CheckedDemoThrows.java:7)
        at edu.exam.ocp.se6.sg.chapter3.exception.CheckedDemoThrows.main(CheckedDemoThrows.java:24)
End of main
*/