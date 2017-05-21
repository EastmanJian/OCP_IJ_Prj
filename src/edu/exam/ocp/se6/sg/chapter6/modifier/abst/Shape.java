package edu.exam.ocp.se6.sg.chapter6.modifier.abst;

/**
 * Example of abstract modifier and abstract class
 */
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
        System.out.print("Abstract class constructor"); //abstract class' constructor can have implementation codes.
    }

    protected abstract double computeArea();

    public void otherMethod() {
        System.out.print("non-abstract method"); //non-abstract method can have implementation codes.
    }
}