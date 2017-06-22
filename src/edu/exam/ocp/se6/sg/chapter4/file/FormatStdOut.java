package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.PrintWriter;

/**
 * Example of PrintWriter.format()
 */
public class FormatStdOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out); //PrintWriter is chained to System.out
        double d = 0.1/0.3;
        String intro = "d = ";
        out.format("%s%7.3f", intro, d); //width = 7, decimal points = 3
        out.flush(); //flush the PrintWriter, otherwise, the formatted characters are still in the PrintWriter steam.

        System.out.format("\n%s%7.3f", intro, d); //same output using the System.out PrintStream object.
    }
}

/* ->
d =   0.333
d =   0.333
*/
