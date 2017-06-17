package edu.exam.ocp.se6.sg.chapter2.interfaces;

import java.awt.Rectangle;

public interface Drawable {
    int MAX_WIDTH = 1024; //public static final keywords are omitted.

    public void draw(); //public keyword can be omitted. abstract keyword is omitted.

    abstract Rectangle getDimensions(); //abstract keyword can be omitted. public keyword is omitted.

    void resize(int w, int h);
}