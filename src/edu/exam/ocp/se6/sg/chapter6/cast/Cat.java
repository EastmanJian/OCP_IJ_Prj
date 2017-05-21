package edu.exam.ocp.se6.sg.chapter6.cast;

public class Cat extends Pet implements Mammal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void breathe() {
        System.out.println("Cat is breathing");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}