package edu.exam.ocp.se6.pe.sat2.q09;

public class Internet {
    private int y = 8;

    public static void main(String[] args) {
        new Internet().go();
    }

    void go() {
        int x = 7;
//        x = 9; //leads to compile error at line 'System.out.println(y + x);': local variables referenced from an inner class must be final or effectively final
        class TCPIP {
            void doit() {
//                 x = 9; //compile error: local variables referenced from an inner class must be final or effectively final
                System.out.println(y + x);
            }
        }
        TCPIP ip = new TCPIP(); //this line cannot put before TCPIP declaration
        ip.doit();
    }
}