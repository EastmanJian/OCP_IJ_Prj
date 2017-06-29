package edu.exam.ocp.se6.pe.pe4.q52;

public class Egg<E extends Object> {
    E egg;

    public Egg(E egg) {
        this.egg = egg;
    }

    public E getEgg() {
        return egg;
    }

    public static void main(String[] args) {
        Egg<Egg> egg1 = new Egg(42);
        Egg egg2 = new Egg<Egg>(egg1.getEgg()); //runtime exception: ClassCastException
        Egg egg3 = egg1.getEgg();
    }
}