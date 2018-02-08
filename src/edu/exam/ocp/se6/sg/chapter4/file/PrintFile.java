package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.*;

/**
 * Example of FileInputStream
 */
public class PrintFile {

    public static void main(String[] args) {
        int c;
        try {
            FileInputStream fis = new FileInputStream("C:\\temp\\states.txt");
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}