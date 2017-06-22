package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.*;

/**
 * Example of File, FileWriter, BufferedWriter, PrintWriter
 * Run it with argument "This is a new file"
 */
public class FileDemo {
    public static void main(String[] args) {
        File test = new File("./test.html");
        if (!test.exists()) {
            try {
                test.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        try {
            FileWriter fw = new FileWriter(test);
            BufferedWriter bw = new BufferedWriter(fw, 1024);
            PrintWriter out = new PrintWriter(fw);
            out.println("<html><body><h1>");
            out.println(args[0]);
            out.println("</h1></body></html>");
            out.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* test.html ->
<html><body><h1>
This is a new file
</h1></body></html>
*/