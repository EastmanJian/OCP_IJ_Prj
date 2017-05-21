package edu.exam.ocp.se6.sg.chapter6.cast;

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
        ((Cat) one).eat();  //Runtime Exception: java.lang.ClassCastException: Dog cannot be cast to Cat
    }
}