package edu.exam.ocp.se6.pe.sat2.q07;

public class One extends Zero {
    int x = 0;

    { System.out.println("One: 1st {}"); }

    static { System.out.println("One: 1st static {}"); }

    public static void main(String[] args) {
        System.out.println("One: Main() Start");
        new One();
        System.out.println("One: Main() End");
    }

    One () {
        System.out.println("One: Constructor");
    }

    { System.out.println("One: 2nd {}"); }

    static {  System.out.println("One: 2nd static {}"); }
}

