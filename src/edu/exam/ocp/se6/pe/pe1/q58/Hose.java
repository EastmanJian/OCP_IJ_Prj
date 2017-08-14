package edu.exam.ocp.se6.pe.pe1.q58;

public class Hose<E extends Hose> {
    E innerE;

/*
    public static E doStuff(E e, Hose<E> e2) { //Compile error: non-static type variable E cannot be referenced from a static context
        return e;
    }
*/

    public E getE() {
        return innerE;
    }
}