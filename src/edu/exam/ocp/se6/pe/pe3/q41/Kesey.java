package edu.exam.ocp.se6.pe.pe3.q41;

import java.io.*;

public class Kesey {
    public static void main(String[] args) throws Exception {
        File file = new File("bigData.txt");
        FileWriter w = new FileWriter(file);
        w.write("lots o' data");
        w.flush(); //Use flush() to flush the data to lower level streams. but here FileWriter is use a the low level stream. Hence flush might not necessary.
        w.close();
    }
}

