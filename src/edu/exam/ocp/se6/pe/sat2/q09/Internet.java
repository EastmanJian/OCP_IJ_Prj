package edu.exam.ocp.se6.pe.sat2.q09;

public class Internet {
    private int y = 8;
    public static void main(String[] args) {
        new Internet().go();
    }
    void go() {
        int x = 7;
        class TCPIP {
            void doit() { System.out.println(y + x); }
        }
        TCPIP ip = new TCPIP();
        ip.doit();
    }
}