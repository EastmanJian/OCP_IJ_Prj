package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
