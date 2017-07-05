package edu.exam.ocp.se6.sg.assessment.q18;

public class Child extends Parent {
    protected String doSomething(int y) { return null; }
/*
    int doAnything(String s) { //Compile Error: incompatible return type
        return 0;
    }
*/

/*
    Integer doNothing() { //Compile Error: incompatible return type
        return 0;
    }
*/
}
