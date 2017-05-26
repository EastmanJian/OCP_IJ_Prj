package edu.exam.ocp.se6.sg.chapter2.nested.statics;

/**
 * Example of static nested class
 */
import java.awt.Dimension;
public class Shipment {
    private int a;
    public static class Box {
        public Dimension dimension;
        public int depth;
        public Box(Dimension d, int x) {
            dimension = d;
            depth = x;
//            a = 1; //Compile Error: non-static variable a cannot be referenced from a static context. (Static Nested Class cannot access enclosing class member.
        }
        public int getVolume() {
            return dimension.height * dimension.width * depth;
        }
    }
    public Box box;
}