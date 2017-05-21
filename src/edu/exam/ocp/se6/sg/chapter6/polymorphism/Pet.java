package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 * Example of polymorphism.
 *
 * Pet class to represent the parent class of various types of pets
 */
public class Pet {
    private String name;
    private int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
}
