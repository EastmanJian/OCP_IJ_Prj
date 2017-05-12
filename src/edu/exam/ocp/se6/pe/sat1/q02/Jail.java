package edu.exam.ocp.se6.pe.sat1.q02;

public class Jail {
    private int x = 4;
    public static void main(String[] args) {
        protected int x = 6;
        new Jail().new Cell().slam();
    }
    class Cell {
        void slam() { System.out.println("throw away key " + x); }
    }
}