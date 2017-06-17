package edu.exam.ocp.se6.sg.chapter2.interfaces;

import java.awt.Rectangle;

public class Picture implements Drawable {
    private Rectangle dimensions;
    private String artist;

    public Picture(String artist, int width, int height) {
        this.artist = artist;
        dimensions = new Rectangle(width, height);
    }

    public void draw() {
        System.out.println("Drawing a Picture");
    }

    public Rectangle getDimensions() {
        return dimensions;
    }

    public String getArtist() {
        return artist;
    }

    public void resize(int width, int height) {
        if (width < Drawable.MAX_WIDTH) {
            dimensions = new Rectangle(width, height);
        }
    }
}