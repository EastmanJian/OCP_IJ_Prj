package edu.exam.ocp.se6.sg.chapter2.abstractclass;

public abstract class Mammal {
    public boolean hasFur;

    { hasFur = false; }

    public Mammal() {
        hasFur = false;
    }

    public Mammal(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void breathe() {
        System.out.println("Mammal is breathing");
    }

    public void eat(String something) {
        System.out.println("Mammal is eating " + something);
    }

    public abstract void walk();
}