package edu.exam.ocp.se6.sg.chapter2.variables.scope;

/**
 * Example of class variable (static field)
 */
public class House {
    private Room kitchen; //instance variable
    public static int counter; //class variable, initially 0.
    public static Room aSharedRoom; //class variable, initially null.
    public static boolean isWood; //class variable, initially false.

    public House() {
        kitchen = new Room();
    }

    public Room getKitchen() {
        counter++;
        return kitchen;
    }
}

class Room {
}