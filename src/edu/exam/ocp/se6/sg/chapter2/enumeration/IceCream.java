package edu.exam.ocp.se6.sg.chapter2.enumeration;

/**
 * Example of enum constructor
 */
public enum IceCream {
    PLAIN(2),
    SUGAR(3),
    WAFFLE(5);

    private IceCream(int scoops) {
        this.scoops = scoops;
    }

    public final int scoops;
}