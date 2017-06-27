package edu.exam.ocp.se6.pe.pe3.q26;

public class Q26 {
    static String s;
    static Boolean b;
    static Boolean t1() { return new Boolean("howdy"); }
    static boolean t2() { return new Boolean(s); }
    public static void main(String[] args) {
        if(t1()) System.out.println("t1 ");
        if(!t2()) System.out.println("t2 ");
        if(t1() != t2()) System.out.println("!= ");

        System.out.println(new Boolean("TrUe")); // -> true
        System.out.println(new Boolean(null));   // -> false
        System.out.println(new Boolean("anything")); // -> false
    }
}