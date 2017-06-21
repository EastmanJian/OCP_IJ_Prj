package edu.exam.ocp.se6.sg.chapter2.methods.finalmethod;

/**
 * Example of final method
 */
public class Lion {
    public void eat(String something) {
        System.out.println("Lion is eating");
    }

    public final void breathe() {
        System.out.println("Lion is breathing");
    }
}