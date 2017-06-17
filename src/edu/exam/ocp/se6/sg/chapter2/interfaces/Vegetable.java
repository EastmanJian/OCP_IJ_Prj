package edu.exam.ocp.se6.sg.chapter2.interfaces;

/**
 * An abstract class implements an interface.
 * It's not required to implements all the methods of the interface if the class is abstract.
 */
abstract public class Vegetable implements Plant {
    public Vegetable() {
        System.out.println("Instantiate Vegetable.");
    }
}
