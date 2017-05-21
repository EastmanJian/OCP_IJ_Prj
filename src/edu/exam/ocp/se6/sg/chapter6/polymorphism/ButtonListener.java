package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 * All methods in Java are virtual methods, meaning that if a method is overridden,
 * the overridden method is always invoked at runtime, even if the compiler sees the parent
 * class method at compile time.
 */
public class ButtonListener {
    public void buttonClicked() {
        System.out.println("Inside ButtonListener");
    }
}