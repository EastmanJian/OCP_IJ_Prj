package edu.exam.ocp.se6.pe.pe3.q60;

/**
 * run with
 * java -ea Alamo y
 */
public class Alamo {
    public static void main(String[] args) {
        try {
            assert (!args[0].equals("x")) : "kate";
        } catch (Error e) {
            System.out.print("ae ");
        } finally {
            try {
                assert (!args[0].equals("y")) : "jane";
            } catch (Exception e2) {
                System.out.print("ae2 ");
            } finally {
                throw new IllegalArgumentException();
            }
        }
    }
}

/* ->
Exception in thread "main" java.lang.IllegalArgumentException
*/