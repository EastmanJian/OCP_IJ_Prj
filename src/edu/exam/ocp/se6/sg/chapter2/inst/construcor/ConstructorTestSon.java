package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

public class ConstructorTestSon extends ConstructorTestFather {
    public ConstructorTestSon (String s) {
        super(s);
        System.out.println("Son parameter constructor - String");
    }

    public ConstructorTestSon (int x) {
        System.out.println("Son parameter constructor - int");
    }
}
