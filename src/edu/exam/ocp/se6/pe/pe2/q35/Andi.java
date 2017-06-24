package edu.exam.ocp.se6.pe.pe2.q35;

public class Andi extends Horse {
    void beBrisk() {
        s += "tolt ";
    }

    public static void main(String[] args) {
        Horse x0 = new Horse();
        Horse x1 = new Andi();
        x1.beBrisk();
        Andi x2 = (Andi) x1;
        x2.beBrisk();
        Andi x3 = (Andi) x0;
        x3.beBrisk();
        System.out.println(s);

    }
}
