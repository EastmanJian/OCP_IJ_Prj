package edu.exam.ocp.se6.sg.chapter2.nested.statics.imp;

import java.awt.Dimension;

/** any of the following two import statement works for the static inner class Shipment.Box */
import static edu.exam.ocp.se6.sg.chapter2.nested.statics.Shipment.Box;
//import edu.exam.ocp.se6.sg.chapter2.nested.statics.Shipment.Box;

public class ImportStaticInner {
    public static void main(String[] args) {
        Box b= new Box(new Dimension(6,3), 5);
    }
}
