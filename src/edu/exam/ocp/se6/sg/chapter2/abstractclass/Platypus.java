package edu.exam.ocp.se6.sg.chapter2.abstractclass;

public class Platypus extends Mammal {
    public int eggCount;

    public void layEggs() {
        System.out.println("Platypus is laying eggs");
    }

    public void eat(String something) {
        System.out.println("Platypus is eating " + something);
    }

    public Platypus(boolean hasFur) {
        super(hasFur);
        eggCount = 1;
    }

    public void walk() {
        System.out.println("Platypus is walking");
    }

    public static void main(String[] args) {
        Platypus p = new Platypus(false);
        p.eat("leaves"); //invoke the overridden method
        p.breathe(); //invoke the method in the abstract class
        p.layEggs(); //invoke the method in the subclass
        p.walk(); //invoke the overridden abstract method
    }
}

/* ->
Platypus is eating leaves
Mammal is breathing
Platypus is laying eggs
Platypus is walking
*/