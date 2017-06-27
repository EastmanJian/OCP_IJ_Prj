package edu.exam.ocp.se6.pe.pe3.q06;

import java.util.*;

public class Elway {
    public static void main(String[] args) {
        ArrayList[] ls = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            ls[i] = new ArrayList();
            ls[i].add("a" + i);
        }
        Object o = ls;
        do3(ls);
        for (int i = 0; i < 3; i++) {
            // insert code here
//            System.out.print(o[i] + " ");
//            System.out.print((ArrayList[])[i] + " ");
            System.out.print( ((Object[])o)[i] + " ");
            System.out.print(((ArrayList[])o)[i] + " ");
        }

        System.out.println();
        ArrayList al = new ArrayList();
        al.add(1);al.add(2);al.add(3);
        System.out.println(al);
        Object obj = al;
        System.out.println(obj);

    }

    static Object do3(ArrayList[] a) {
        for (int i = 0; i < 3; i++) a[i].add("e");
        return a;
    }
}