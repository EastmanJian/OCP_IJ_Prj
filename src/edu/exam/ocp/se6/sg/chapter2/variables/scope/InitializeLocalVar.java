package edu.exam.ocp.se6.sg.chapter2.variables.scope;

/**
 * Example of local variable
 */
public class InitializeLocalVar {
    public int notValid() {
        int y = 10;
//        double y =10.0; //Compile Error:variable y is already defined in method notValid()
        int x;
//        int reply = x + y; //Compile Error: variable x might not have been initialized
//        return reply;
        return 0;
    }
}
