package edu.exam.ocp.se6.sg.chapter6.polymorphism;

/**
 * Cat  extends Pet, a Cat object is a Pet object. Because Cat implements Mammal, a Cat object is  also a Mammal object.
 *
 */
public class Cat extends Pet implements Mammal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void breathe() {
        System.out.println("Cat is breathing");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public static void main(String[] args) {
        /*
        The reference p can only refer to Pet objects, but because a Cat object is a Pet object,
        assigning p to c is valid. Similarly, the reference m can only refer to Mammal objects, but
        because a Cat object is a Mammal, assigning m to c is also valid. There is only one Cat
        object in memory, but the object is taking on three different forms. The c reference is
        treating the object as a Cat, the p reference is treating the object as a Pet, and the m
        reference is treating the object as a Mammal.
        */
        Cat c = new Cat("Garfield", 3);
        Pet p = c;
        Mammal m = c;

        /*
        The following statements are valid without requiring any casting:
        Using the reference c, you can invoke all the methods of Cat, Pet, and Mammal. Using the
        reference p, you can only invoke the eat method of Pet. Even though the corresponding Cat
        object contains sleep and breathe methods, the p reference does not see those methods
        because the p reference thinks it is pointing to a Pet object (not a Cat). Similarly, using the
        m reference, you can only invoke the breathe method, even though the object has an eat
        and a sleep method. Casting is required if you want to invoke the "hidden" methods of the
        Cat object using the m and p references.
        */
        c.sleep();
        c.breathe();
        c.eat();
        p.eat();
        m.breathe();

        System.out.println();
        /*
        Casting Polymorphic References:
        In general, the only time casting is necessary is when you need to invoke a method defined in a child class
        using a parent class or interface reference and the method is not overridden.
        The Cat class contains a sleep method that does not override any methods in Pet or Mammal. To invoke sleep
        using a Pet reference, you need to cast the reference first.
        The pet reference is of type Pet, so invoking eat using pet reference does not require a cast. However,
        invoking sleep requires pet to be cast to Cat. Invoking breathe requires pet to be cast to either Mammal or Cat.
        */
        Pet pet = new Cat("Alley", 7);
        pet.eat(); //no cast needed
        ((Cat) pet).sleep(); //cast is needed
        ((Mammal) pet).breathe(); //cast is needed
        ((Cat) pet).breathe(); //Same as previous line of code
    }
}
