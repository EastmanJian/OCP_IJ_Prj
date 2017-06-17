package edu.exam.ocp.se6.sg.chapter2.interfaces;

import java.awt.Rectangle;

/**
 * Example of implementing multiple interfaces
 */
public class Flower implements Plant, Drawable {
    public int numOfLeaves;

    public void photosynthesize() {
        System.out.println("Plant is photosynthesizing");
    }

    public void draw() {
        System.out.println("Drawing a Plant");
    }

    public Rectangle getDimensions() {
        return new Rectangle(0, 0);
    }

    public void resize(int w, int h) {
        System.out.println("Resizing a Plant?");
    }
}