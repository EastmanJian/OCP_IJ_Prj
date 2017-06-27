package edu.exam.ocp.se6.pe.pe2.q42;

import java.util.ArrayList;
import java.util.List;

public class Chips extends Snack {
    public static void main(String[] args) {
        List c1 = new ArrayList();
        s1.add("1");
        s1.add("2");
        c1.add("3");
        c1.add("4");
        getStuff(s1, c1);
    }

    static void getStuff(List<String> a1, List a2) {
        for (String s1 : a1) System.out.print(s1 + " ");
//        for (String s2 : a2) System.out.print(s2 + " "); //Compile Error: incompatible types: java.lang.Object cannot be converted to java.lang.String
        for (String s2 : (List<String>)a2) System.out.print(s2 + " ");
        for (Object s2 : a2) System.out.print(s2 + " ");
        for (Object s2 : a2) System.out.print((String)s2 + " ");
    }
}