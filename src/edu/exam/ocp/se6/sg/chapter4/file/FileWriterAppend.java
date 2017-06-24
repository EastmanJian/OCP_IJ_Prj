package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Use FileWriter("file", true) to append text to a file. Chained with PrinterWriter.
 * (This is out of SG book)
 */
public class FileWriterAppend {
    public static void main(String[] args) throws IOException {
        int i = 101;
        double d = 1.0 / 3.0;
        StringBuilder s = new StringBuilder("hello");
        boolean b = true;
        FileWriter fw = new FileWriter("characters.txt", true);
        PrintWriter out = new PrintWriter(fw);
        out.print(i);
        out.println(d);
        out.println(s);
        out.println(b);
        out.close();
        fw.close();
    }
}
/* run twice, inside characters.txt ->
1010.3333333333333333
hello
true
1010.3333333333333333
hello
true
*/
