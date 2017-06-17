package edu.exam.ocp.se6.sg.chapter1.packages;
/**
 * Example of using wildcard in import statements
 */

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        File file = new File("mydata.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader in = new BufferedReader(fileReader);
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}