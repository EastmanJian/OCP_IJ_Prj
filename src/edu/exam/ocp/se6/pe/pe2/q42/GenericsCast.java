package edu.exam.ocp.se6.pe.pe2.q42;

import java.util.ArrayList;
import java.util.List;

public class GenericsCast {
    public static void main(String[] args) {
        List c1 = new ArrayList();
        c1.add("3");
        c1.add("4");
        for (String s : (List<String>) c1) System.out.print(s + " "); //cast non-generic List to a generic List -> 3 4
        for (Object o : c1) System.out.print(o + " ");  // -> 3 4
        for (Object o : c1) System.out.print((String) o + " ");  // -> 3 4
    }
}