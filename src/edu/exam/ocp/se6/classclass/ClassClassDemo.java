package edu.exam.ocp.se6.classclass;

/**
 * Example of using class Class and the class keyword.
 */
public class ClassClassDemo {
    public static void main(String[] arg){
        ClassClassDemo obj = new ClassClassDemo();
        System.out.println("The class of " + obj + " is " + obj.getClass().getName());
        System.out.println("The class name of class ClassClassDemo is " + ClassClassDemo.class.getName());
    }
}
