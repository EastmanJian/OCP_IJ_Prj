package edu.exam.ocp.se6.pe.pe1.q53;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String in = "1234,77777,689";
        Scanner sc = new Scanner(in);
        sc.useDelimiter(",");
//        while (sc.hasNext())
//            System.out.print(sc.nextInt() + " ");
        while (sc.hasNext())
            System.out.print(sc.nextShort() + " ");
    }
}

/* if the first while loop is commented ->
1234 Exception in thread "main" java.util.InputMismatchException: ...
*/
