package edu.exam.ocp.se6.pe.pe4.q50;

import java.util.*;

public class GIS {
    public static void main(String[] args) {
        TreeMap<String, String> m1 = new TreeMap<String, String>();
        m1.put("a", "amy");
        m1.put("f", "frank");
        NavigableMap<String, String> m2 = m1.descendingMap();
        try {
            m1.put("j", "john");
            m2.put("m", "mary");
        } catch (Exception e) {
            System.out.print("ex ");
        }
        m1.pollFirstEntry();
        System.out.println(m1 + " " + m2); // -> {f=frank, j=john, m=mary} {m=mary, j=john, f=frank}
    }
}
