package edu.exam.ocp.se6.sg.chapter6.modifier.abst;

public class InvalidShape extends Shape {
    public InvalidShape(String color) {
        super(color);
    }
//    double computeArea() { //Compile Error: computeArea() in InvalidShape cannot override computeArea() in Shape, attempting to assign weaker access privileges; was protected
//        System.out.println("Computing area...");
//        return 0.0;
//    }

    public double computeArea() {
        System.out.println("Computing area...");
        return 0.0;
    }

}