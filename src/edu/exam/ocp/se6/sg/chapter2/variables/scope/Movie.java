package edu.exam.ocp.se6.sg.chapter2.variables.scope;

/**
 * Example of explicit initialization
 *
 * Because the Vector has the same initial value for all instances of the Movie class, using explicit initialization
 * makes sense and simplifies the constructor code.
 * If the Movie class had multiple constructors, we would have to make sure that the Vector gets instantiated in
 * each constructor. By using explicit initialization, we are ensured that the fans field is properly initialized
 * for all instances of Movie, and the initialization takes place in a single location (instead of in multiple
 * constructors).
 */

import java.util.Vector;

public class Movie {
    public Vector<Fan> fans = new Vector<Fan>();
    public String title;
    public double boxOfficeTotal;

    public Movie(String title) {
        this.title = title;
    }

    public Movie() {
        this("X-Man");
    }

    public void addFan(Fan f) {
        fans.add(f);
    }
}

class Fan {
}