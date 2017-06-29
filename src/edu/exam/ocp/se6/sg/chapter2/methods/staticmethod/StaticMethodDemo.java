package edu.exam.ocp.se6.sg.chapter2.methods.staticmethod;

public class StaticMethodDemo {
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        double x = 49.0;
        double response = Math.sqrt(x); /** invoke static method by classname as prefix */
        System.out.println(response); // -> 7.0

        StaticMethodDemo smd = new StaticMethodDemo();
        double result = smd.sqrt(x); /** invoke static method by an instance name. */
        System.out.println(response); // -> 7.0
    }
}
