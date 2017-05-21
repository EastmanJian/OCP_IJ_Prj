package edu.exam.ocp.se6.sg.chapter6.modifier.fin;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.CONS);
//        b.CONS = "abc"; //Compile Error: cannot assign a value to final variable CONS

    }
}
