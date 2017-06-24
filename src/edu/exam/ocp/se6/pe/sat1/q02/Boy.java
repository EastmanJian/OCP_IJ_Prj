package edu.exam.ocp.se6.pe.sat1.q02;

public class Boy extends Father {
    public static void main(String[] args) {
        Boy b = new Boy();
        b.noModifier();
        b.protectedModifier();
    }
}
/* ->
method without Modifier in Father.
method with protected modifier in Father.
*/
