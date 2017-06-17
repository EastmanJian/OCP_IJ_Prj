package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Example of NumberFormatException
 */
public class NumberFormatE {
    public static void main(String[] args) {
        String s = "hello";
        int x = Integer.parseInt(s); //Runtime Exception:  java.lang.NumberFormatException: For input string: "hello"
    }
}
/* ->
Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at edu.exam.ocp.se6.sg.chapter3.exception.NumberFormatE.main(NumberFormatE.java:9)
 */