package edu.exam.ocp.se6.pe.sat2.q07;

public class Go extends Game {
//    Go() { super(s2); }  //compile error: cannot reference s2 before supertype constructor has been called
    Go() { super("s2"); }
    { s += "i "; }
    public static void main(String[] args) {
        new Go();
        System.out.println(s);
    }
    static { s += "sb "; }
}