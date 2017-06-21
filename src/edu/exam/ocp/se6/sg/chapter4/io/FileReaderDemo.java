package edu.exam.ocp.se6.sg.chapter4.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * In the real world, reading one character from a file is not done because it is inefficient and typically the data
 * in the file represents data types beyond characters. Typically, you take a FileReader and attach a high-level stream
 * to it to buffer and filter the data.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("alphabet.txt"); //suppose the file contains the 26 characters of the alphabet in lowercase
        int c = 0;
        while((c = in.read()) != -1) {
            System.out.print((char) c);
        } // -> abcdefghijklmnopqrstuvwxyz
    }
}
