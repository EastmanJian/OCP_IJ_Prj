package edu.exam.ocp.se6.sg.chapter2.enumeration;

/**
 * Example of enum and enum's method
 */
public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public String toString() {
        return this.name().toLowerCase();
    }
}