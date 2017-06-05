package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

public class ConstructorTester {
    public static void main(String[] args) {
        new ConstructorTestSon("Test");
        System.out.println();
        new ConstructorTestSonB("Test");
        System.out.println();
        new ConstructorTestSonB();
        System.out.println();
        new ConstructorTestSon(1);
        System.out.println();
        new ConstructorTestSonB(2);
    }
}

/* -->
Father Constructor with String as para
Son parameter constructor - String

Father default constructor
SonB parameter constructor

Father default constructor
SonB default constructor

Father default constructor
Son parameter constructor - int

Father default constructor
SonB default constructor
SonB parameter constructor - int
*/
