package edu.exam.ocp.se6.sg.chapter1.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;
        System.out.println(x < y);  //true
        System.out.println(x <= y); //true
        System.out.println(x > z);  //false
        System.out.println(x >= z); //true

//        int result = x < y; //Compile Error. Unlike C and C++, the boolean primitive type in Java is not compatible with the int type.
    }
}
