package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

public class ConstructorTestSonB extends ConstructorTestFather {
    ConstructorTestSonB () {
        System.out.println("SonB default constructor");
    }

    public ConstructorTestSonB (String s) {
        System.out.println("SonB parameter constructor");
    }

    public ConstructorTestSonB (int x) {
        this();
        System.out.println("SonB parameter constructor - int");
    }

}
