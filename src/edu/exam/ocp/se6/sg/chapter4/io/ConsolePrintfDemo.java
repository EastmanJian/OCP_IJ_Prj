package edu.exam.ocp.se6.sg.chapter4.io;

import java.io.Console;
import java.io.IOException;

public class ConsolePrintfDemo {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        if (console == null) {
            throw new IOException("Console not available");
        }
        String formula = "Formula = ";
        double radius = 2.0;
        console.format("%10s%12.10f * %3$4.2f * %3$4.2f%n", formula, Math.PI, radius);
        double area = Math.PI * radius * radius;
        console.format("%10s%16.13f%n", "Result = ", area);
    }
}

/*
C:\>java edu.exam.ocp.se6.sg.chapter4.io.ConsolePrintfDemo
Formula = 3.1415926536 * 2.00 * 2.00
 Result = 12.5663706143592
*/