package edu.exam.ocp.se6.pe.sat1.q02a;

import edu.exam.ocp.se6.pe.sat1.q02.Father;

public class Girl {
    public static void main(String[] args) {
        Father f = new Father();
//        f.noModifier(); //compile error, because noModifier is a friendly method, only accessible in the same package.
//        f.protectedModifier(); //compile error, because the mothod is a protected method, only accessible in the same package.
    }
}
