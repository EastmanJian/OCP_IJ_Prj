package edu.exam.ocp.se6.sg.chapter2.methods.staticmethod;

/**
 * Example of static method accessing non-static field (instance variable).
 */
public class StaticProblem {
    public static int counter = 0;
    public String message;
    public static void incrementCounter() {
        counter++;
//        System.out.println(message + counter); //Compile Error: non-static variable message cannot be referenced from a static context
    }
}