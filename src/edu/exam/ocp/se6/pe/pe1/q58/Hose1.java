package edu.exam.ocp.se6.pe.pe1.q58;

public class Hose1<E extends Hose1> {
    E innerE;

    public E doStuff(E e, Hose1<E> e2) {
//        return e;  //compiles fine
//        return e.getE(); //Compile error: incompatible types: Hose1 cannot be converted to E
//        return e2; //Compile Error: incompatible types: Hose1<E> cannot be converted to E
        return e2.getE(); //compiles fine
    }

    public E getE() {
        return innerE;
    }
}