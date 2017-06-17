package edu.exam.ocp.se6.sg.chapter2.interfaces;

/**
 * Example of extending multiple interfaces.
 * A class that implements Image must implement the getFormat method, as well as the run method from Runnable
 * and the three methods from Drawable.
 */
public interface Image extends Runnable, Drawable {
    public String getFormat();
}