package edu.exam.ocp.se6.sg.chapter2.review.q16;

import java.awt.Dimension;

public class Shipment {
    public static class Box {
        public Dimension dimension;
        public int depth;

        public Box(Dimension d, int x) {
            dimension = d;
            depth = x;
        }

        private int getVolume() {
            return dimension.height * dimension.width * depth;
        }
    }

    public Box box;

    public void go() {
        System.out.println(box.getVolume());
    }

    public static void main(String[] args) {
        Dimension dim = new Dimension(10,10);
        Box b = new Box(dim, 10);
        Shipment s = new Shipment();
        s.box = b;
        s.go();
    }
}