package edu.exam.ocp.se6.pe.pe2.q54;

public class Child extends Father {
    static String name = "ch ";

    static String say() {
        return "childsaid ";
    }

    String doStuff() {
        return "child ";
    }

    public static void main(String[] args) {
        Father f = new Father();
        System.out.print(((Grandfather) f).name
                + ((Grandfather) f).doStuff()
                + ((Grandfather)f).say() + "\n"); // -> gf father gfsaid
        Child c = new Child();
        System.out.println(((Grandfather) c).name
                + ((Grandfather) c).doStuff()
                + ((Father) c).doStuff()
                + ((Father)f).say()); // -> gf child child fathersaid
    }
}