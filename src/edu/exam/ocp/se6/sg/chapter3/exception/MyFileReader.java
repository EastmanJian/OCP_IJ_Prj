package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Multiple catch
 */

import java.io.*;

public class MyFileReader {
    public void readFromFile(String fileName) {
        try {
            FileReader fis = new FileReader(fileName);
            System.out.println(fileName + " was found");
            char data = (char) fis.read();
            System.out.println("Just read: " + data);
        } catch (FileNotFoundException e) {
            System.out.println("Oops - file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        System.out.println("End of readFromFile");
    }

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader();
        reader.readFromFile("mydata.txt");
        System.out.println("End of main");
    }
}
