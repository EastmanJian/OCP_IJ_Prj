package edu.exam.ocp.se6.pe.pe3.q58;

import java.util.*;

public class Salt {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(0);
        s1.add("1");
        doStuff(s1); // -> 2 0 1 0 1 false
        System.out.println();

        Set<Number> s = s1; //same as "Set<Number> s = (Set<Number>)s1;"
        for (Number n : s) {
            System.out.println(n); //runtime ClassCastException: String cannot be cast to Number.
        }

        Object o = new String("abc");
//        Number n1 = o; //compile error
        Number n2 = (Number)o; //runtime ClassCastException: String cannot be cast to Number.

    }

    static void doStuff(Set<Number> s) {
        do2(s);
        Iterator i = s.iterator();
        while (i.hasNext()) System.out.print(i.next() + " ");
        Object[] oa = s.toArray();
        for (int x = 0; x < oa.length; x++)
            System.out.print(oa[x] + " ");
        System.out.println(s.contains(1));
    }

    static void do2(Set s2) {
        System.out.print(s2.size() + " ");
    }
}