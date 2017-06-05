package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

public class Son extends Father {
//    public Son(String s) { //compile error: constructor Father cannot be applied to given types
//        System.out.println("Son parameter constructor - String");
//    }

//    public Son(int x) { //compile error: constructor Father cannot be applied to given types
//        System.out.println("Son parameter constructor - int");
//    }

    public Son(int x) { //OK
        super("str");
        System.out.println("Son parameter constructor - int");
    }
}
