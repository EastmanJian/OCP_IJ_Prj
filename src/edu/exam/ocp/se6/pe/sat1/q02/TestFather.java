package edu.exam.ocp.se6.pe.sat1.q02;

public class TestFather {
    public static void main(String[] args) {
        Father f = new Father();
        f.noModifier();
        f.protectedModifier();
    }
}
/* ->
method without Modifier in Father.
method with protected modifier in Father.
*/
