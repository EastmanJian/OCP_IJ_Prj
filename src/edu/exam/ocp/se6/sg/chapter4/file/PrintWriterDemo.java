package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Each time the program runs, the characters.txt file is written from the beginning. (It is truncated before write)
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        int i = 101;
        double d = 1.0 / 3.0;
        StringBuilder s = new StringBuilder("hello");
        boolean b = true;
        FileWriter fw = new FileWriter("characters.txt");
        PrintWriter out = new PrintWriter(fw);
        out.print(i);
        out.println(d);
        out.println(s);
        out.println(b);
        out.close();
        fw.close();
    }
}
/* inside characters.txt ->
1010.3333333333333333
hello
true
*/
