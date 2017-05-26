package edu.exam.ocp.se6.sg.chapter2.nested.statics;

import java.awt.Dimension;

/**
 * Example of using Static Nested Class
 */
public class Shoe {
    public Shipment.Box box;

    public Shoe() {
        Dimension dim = new Dimension(6, 10);
        box = new Shipment.Box(dim, 4);
    }

    public static void main(String[] args) {
        Shoe sandal = new Shoe();
        System.out.println("Volume = " + sandal.box.getVolume());
    }
}

/* ->
Volume = 240
*/