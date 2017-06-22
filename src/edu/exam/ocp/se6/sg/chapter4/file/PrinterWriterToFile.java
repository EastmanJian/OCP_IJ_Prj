package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Example of PrinterWriter.format()/printf()
 */
public class PrinterWriterToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("format.txt");
        PrintWriter pw = new PrintWriter(fw);
        double r = Math.random();
        int x = 1, y = 2;
        pw.format("The number %4.2f is between %d and %d%n", r, x, y);
        pw.printf("%2$d %3$s %1$d%n", x, y, "is bigger than");
        pw.flush();
    }
}

/* format.txt sample ->
The number 0.67 is between 1 and 2
2 is bigger than 1
*/
