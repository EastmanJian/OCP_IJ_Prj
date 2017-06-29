package edu.exam.ocp.se6.sg.chapter2.variables.scope;

/**
 * Example of class variable (static field)
 * Even though the HouseTest class creates two House objects (which in turn causes two Room objects to be instantiated
 * for the kitchen field), there is still only one counter in memory and it exists until the program terminates.
 */
public class HouseTest {
    public static void main(String [] args) {
        System.out.println("counter = " + House.counter); // -> counter = 0
        House one = new House();
        House two = new House();
        one.getKitchen();
        two.getKitchen();
        one.getKitchen();
        System.out.println("counter = " + House.counter); // access static field using class name -> counter = 3
        System.out.println("counter = " + one.counter); // access static field using reference -> counter = 3
        System.out.println("counter = " + two.counter); // -> counter = 3
        System.out.println("aSharedRoom = " + House.aSharedRoom); // -> aSharedRoom = null
    }
}