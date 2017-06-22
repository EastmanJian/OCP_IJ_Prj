package edu.exam.ocp.se6.sg.chapter4.regexp;

import java.util.Scanner;

public class ScannerKeyboardInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a String, int and double: ");
        String first = console.next(); //the "next" methods wait for the user to input data.
        int middle = console.nextInt();
        double last = console.nextDouble();
        System.out.println("first = " + first);
        System.out.println("middle = " + middle);
        System.out.println("last = " + last);
        /* ->
        Enter a String, int and double: first 123 4.567
        first = first
        middle = 123
        last = 4.567
        */
    }
}
