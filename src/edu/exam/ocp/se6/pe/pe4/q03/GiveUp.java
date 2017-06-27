package edu.exam.ocp.se6.pe.pe4.q03;


public class GiveUp {
    public static void main(String[] args) throws Exception {
        try {
            assert false;
            System.out.print("t ");
        } catch (Error e) {
            System.out.print("c ");
            throw new Exception();
        } finally {
            System.out.print("f ");
        }
    }
}
/*
//run without java -ea option ->
t f
//run with java -ea option ->
c f ...Exception...
*/