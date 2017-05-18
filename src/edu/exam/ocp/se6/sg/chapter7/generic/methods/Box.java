package edu.exam.ocp.se6.sg.chapter7.generic.methods;

import java.awt.Frame;

public class Box {
    public static <T> void ship(T item) {
        System.out.println("Shipping " + item.toString());
        if (item instanceof Frame) {
            Frame frame = (Frame) item;
            frame.setSize(200, 200);
            frame.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Box.ship("a String object");
        Box.ship(args);
        Box.ship(new Frame());

        //Generics have an optional syntax for specifying the type for a generic method. You can place the data type of the generic in angle brackets, <>, after the dot operator and before the method call.
        Box.<String>ship("String object");
        Box.<String[]>ship(args);
        Box.<Frame>ship(new Frame());
    }
}