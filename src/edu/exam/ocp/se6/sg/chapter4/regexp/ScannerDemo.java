package edu.exam.ocp.se6.sg.chapter4.regexp;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String source = "abc de fgh 123 ijk";
        Scanner scan = new Scanner(source);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                int x = scan.nextInt();
                System.out.println("int = " + x);
            } else {
                String token = scan.next();
                System.out.println(token);
            }
        }
        /* ->
        abc
        de
        fgh
        int = 123
        ijk
        */

        String status = "probable,questionable;doubtful:out";
        Scanner in = new Scanner(status);
        in.useDelimiter("[,;:]");
        while(in.hasNext()) {
            String token = in.next();
            System.out.println(token);
        }
        /* ->
        probable
        questionable
        doubtful
        out
        */
    }
}
