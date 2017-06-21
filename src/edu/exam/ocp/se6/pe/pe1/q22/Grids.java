package edu.exam.ocp.se6.pe.pe1.q22;

public class Grids {
    public static void main(String[] args) {
        int [][] ia2;
        int[] ia1 = {1, 2, 3};
        Object o = ia1; //arrays are objects, this is correct.
        ia2 = new int[3][3];
        ia2[0] = (int[]) o;
//        ia2[0][0] = (int[]) o; //Compile Error, attempts to assign a one-dimensional array into an int.
    }
}