package edu.exam.ocp.se6.pe.pe3.q58;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SaltTest {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(0);
        s1.add("1");

        Set<Number> s = s1; //same as "Set<Number> s = (Set<Number>)s1;"
        s.add(7);
        for (Object n : s) {
            System.out.println(n + " " + n.getClass()); //runtime ClassCastException: String cannot be cast to Number.
        }
    }

}