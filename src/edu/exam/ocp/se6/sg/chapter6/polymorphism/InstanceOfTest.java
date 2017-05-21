package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 *  Using the instanceof operator to determine the runtime type of the reference mypet.
 *  If mypet points to a Cat, we cast it to a Cat before invoking eat. If mypet points to a Dog, we cast it to a
 *  Dog before invoking eat. The previous statements compile and run successfully without a ClassCastException
 *  ever occurring.
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        Pet mypet = new Dog("Fido", 2);
        if (mypet instanceof Cat) {
            ((Cat) mypet).eat();
        } else if (mypet instanceof Dog) {
            ((Dog) mypet).eat();
        }
    }
}

// -> Dog is eating

