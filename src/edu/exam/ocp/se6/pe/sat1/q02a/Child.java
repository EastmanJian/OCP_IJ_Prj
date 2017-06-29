package edu.exam.ocp.se6.pe.sat1.q02a;

import edu.exam.ocp.se6.pe.sat1.q02.Father;

public class Child extends Father {
    public static void main(String[] args) {
        Child child = new Child();
        //child.noModifier(); //compile error, because noModifier is a friendly method, only accessible in the same package.
        child.protectedModifier();

        Father f = new Father();
//        f.noModifier(); //compile error, because noModifier is a friendly method, only accessible in the same package.
//        f.protectedModifier(); //compile error, because the mothod is a protected method, only accessible in the same package.

    }
}
