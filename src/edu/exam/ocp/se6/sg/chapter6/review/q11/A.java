package edu.exam.ocp.se6.sg.chapter6.review.q11;

public abstract class A {
    private void doSomething() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new B();
        a.doSomething(); // -> A
    }
}