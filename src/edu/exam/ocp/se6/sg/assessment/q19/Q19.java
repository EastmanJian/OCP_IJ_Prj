package edu.exam.ocp.se6.sg.assessment.q19;

import java.util.List;
import java.util.Vector;

public class Q19 {
    public static void main(String[] args) {
        List<Number> data = new Vector<Number>();
        data.add(10);
//        data.add("4.5F"); //Compile Error: no suitable method found for add(String). method add(Number) is not applicable (argument mismatch; String cannot be converted to Number)
        data.add(new Double(56.7));
        for (Number number : data) {
            System.out.print(number);
        }
    }
}

