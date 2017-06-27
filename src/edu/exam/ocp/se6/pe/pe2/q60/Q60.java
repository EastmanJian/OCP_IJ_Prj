package edu.exam.ocp.se6.pe.pe2.q60;

import java.util.ArrayList;
import java.util.List;

public class Q60 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();
        x.add(new Integer(3));
        doStuff(x);
        List z = x;
        z.add(new Double(234.565));
        for (Integer i : x)
            System.out.print(i + " ");
    }

    static void doStuff(List y) {
        y.add(new Integer(4));
        y.add(new Float(3.14f));
    }
}
/* ->
3 4 ...ClassCastException...
*/