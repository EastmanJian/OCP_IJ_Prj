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
