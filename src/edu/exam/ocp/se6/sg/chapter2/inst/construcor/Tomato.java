package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

import edu.exam.ocp.se6.sg.chapter2.inst.event.Fruit;

/**
 * You only get a default constructor if you do not explicitly include one in your class.
 * Because this Tomato class has a constructor, the compiler does not add a default constructor.
 */
public class Tomato extends Fruit {
    private double weight;
    private boolean ripe;

    public Tomato(double weight, boolean ripe) {
        this.weight = weight;
        this.ripe = ripe;
    }

    public static void main(String[] args) {
        Tomato beefsteak = new Tomato(10.45, false);
//        Tomato t = new Tomato(); //Generates a compiler error
    }
}