package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 * It is possible to fool the compiler with a cast that fails at runtime.
 */
public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Pet one = new Dog("Fido", 2);
        one.eat();
        ((Dog) one).eat();
        /*
        The following line compiles because the Cat class inherits an eat method from Pet, so invoking
        eat on a Cat is normally a valid statement and the code compiles fine. However, the one
        reference does not point to a Cat object, and the JVM throws an exception at runtime.
         */
        ((Cat) one).eat(); //runtime exception: java.lang.ClassCastException: Dog cannot be cast to Cat
    }
}