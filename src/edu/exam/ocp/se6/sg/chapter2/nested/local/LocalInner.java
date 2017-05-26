package edu.exam.ocp.se6.sg.chapter2.nested.local;

/**
 * Example of Local Inner class
 */
public class LocalInner {
    public double radius;

    public void doSomething() {
        final double pi = 3.1415; //in java 1.6, Local Inner class do not have access to local variable unless it's final. But in newer Java version, this is not reqired.
        class Circle {
            public double area() {
                return pi * radius * radius;
            }
        }
        Circle c = new Circle();
        System.out.println(c.area());
    }

    public static void main(String[] args) {
        LocalInner x = new LocalInner();
        x.radius = 10;
        x.doSomething();
    }
}

/* ->
314.15000000000003
*/