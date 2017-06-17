package edu.exam.ocp.se6.pe.pe1.q09;

public class Q09e {
    static String s = "";
    public static void main(String[] args) {
        try { doStuff(args); }
        catch (Error e) { s += "e "; }
        s += "x ";
        System.out.println(s);
    }
    static void doStuff(String[] args) {
        if(args.length == 0)
            throw new LinkageError();
        s += "d ";
    }
}

/* ->
e x
*/
