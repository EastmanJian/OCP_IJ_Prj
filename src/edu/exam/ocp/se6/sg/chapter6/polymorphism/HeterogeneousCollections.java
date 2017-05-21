package edu.exam.ocp.se6.sg.chapter6.polymorphism;

import java.util.ArrayList;

/**
 * A heterogeneous collection is a collection of objects that are not the same data type but have a common parent class.
 * This type of collection is made possible because of polymorphism.
 */
public class HeterogeneousCollections {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("", 4));
        pets.add(new Cat("Alley", 7));
        pets.add(new Dog("Fido", 2));
    }
}
