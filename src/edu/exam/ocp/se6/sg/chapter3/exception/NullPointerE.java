package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Example of NullPointerException
 */
public class NullPointerE {
    public static void main(String[] args) {
        Integer x = null;
        System.out.println(x.intValue()); //JVM throws
    }

    public void printMessage(String message) {
        if(message == null) {
            throw new NullPointerException("message cannot be null"); //Programmatically
        }
        System.out.println(message);
    }
}
