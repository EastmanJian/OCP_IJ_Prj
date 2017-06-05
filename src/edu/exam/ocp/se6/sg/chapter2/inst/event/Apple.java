package edu.exam.ocp.se6.sg.chapter2.inst.event;

/**
 * Instantiation events' order
 */
public class Apple extends Fruit {
    public String variety = "McIntosh";

    public Apple(String variety) {
        System.out.println("Constructing an Apple");
        this.variety = variety;
    }

    {
        System.out.println("Inside the instance initializer");
        System.out.println("The variety is " + variety);
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Granny Smith");
        System.out.println("Variety is " + apple.variety);
    }
}

/* -->
Constructing a Fruit
Inside the instance initializer
The variety is McIntosh
Constructing an Apple
Variety is Granny Smith
*/