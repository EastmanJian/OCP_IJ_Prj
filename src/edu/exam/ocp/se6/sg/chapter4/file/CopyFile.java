package edu.exam.ocp.se6.sg.chapter4.file;

import java.io.*;

/**
 * Example of FileInputStream, FileOutputStream
 * Set the working path to the path of States.class before run.
 */
public class CopyFile {
    public static void copy(File src, File dest)
            throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest);
        int c;
        try {
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            in.close();
            out.close();
        }
    }

    public static void main(String[] args) {
        try {
            File source = new File("States.class");
            File destination = new File("copyofStates.class");
            copy(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}