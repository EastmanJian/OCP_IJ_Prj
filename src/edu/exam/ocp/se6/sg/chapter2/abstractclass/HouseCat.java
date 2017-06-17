package edu.exam.ocp.se6.sg.chapter2.abstractclass;

public class HouseCat {//extends Feline { //Compile Error if extends Feline: HouseCat is not abstract and does not override abstract method walk() in Mammal
    public void eat() {
        System.out.println("HouseCat is eating");
    }

    public void breathe() {
        System.out.println("HouseCat is breathing");
    }
}