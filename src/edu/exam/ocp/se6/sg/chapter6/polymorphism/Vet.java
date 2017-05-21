package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 * Example of polymorphic parameters:
 * If a method parameter is a class type, the argument passed in can be any child type of the class as well.
 * The following Vet class contains a vaccinate method that takes in a Pet reference.
 * The argument passed into vaccinate can certainly be a Pet object, but you can also pass in a Cat object, a
 * Dog object, or any other object that is a child class of Pet.
 * Use the instanceof operator if we need to cast the reference to its appropriate child class type.
 */
public class Vet {
    public void vaccinate(Pet pet) {
        if(pet instanceof Dog) {
            System.out.println("Vaccinating a dog");
            Dog dog = (Dog) pet;
            //use the dog reference
        } else if(pet instanceof Cat) {
            System.out.println("Vaccinating a cat");
            Cat cat = (Cat) pet;
            //use the cat reference
        }
    }
}