package edu.exam.ocp.se6.sg.chapter1.equality;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog))
            return false;
        Dog other = (Dog) obj;
        if (this.name.equals(other.name) && (this.age == other.age)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return age;
    }

    public static void main(String[] args) {
        Dog one = new Dog("Fido", 3);
        Dog two = new Dog("Fido", 3);
        Dog three = new Dog("Lassie", 3);
        if(one.equals(two)) {
            System.out.println("Fido");
        }
        if(one.equals(three)) {
            System.out.println("Lassie");
        }
        if(one == two) {
            System.out.println("one == two");
        }
    }
}

/*
Fido
*/
