package edu.exam.ocp.se6.pe.pe4.q01;

public class Echo extends Vibrate {
    Echo() { this(7); s += "e"; }
    Echo(int x) {  s += "e2"; }

    public static void main(String[] args) {
        System.out.print("made " + s + " ");
    }

    static {
        Echo e = new Echo();
        System.out.print("block " + s + " ");
    }
}

/*
block -ve2e made -ve2e
*/