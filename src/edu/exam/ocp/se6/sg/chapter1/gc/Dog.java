package edu.exam.ocp.se6.sg.chapter1.gc;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void finalize() {
        System.out.println(name + " is being garbage collected");
    }
}