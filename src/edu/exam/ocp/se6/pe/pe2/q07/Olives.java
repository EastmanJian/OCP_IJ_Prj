package edu.exam.ocp.se6.pe.pe2.q07;

import java.util.*;

public class Olives {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<Integer>();
        s.add(23);
        s.add(42);
        s.add(new Integer(5));
        Iterator i = s.iterator();
//        while (System.out.print(i.next())) {}
//        for (Integer i2 : i) System.out.print(i2);
        for (Integer i3 : s) System.out.print(i3); // -> 52342
//        while (i.hasNext()) System.out.print(i.get());
        while (i.hasNext()) System.out.print(i.next()); // -> 52342
    }
}