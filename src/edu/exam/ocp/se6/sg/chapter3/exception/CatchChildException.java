package edu.exam.ocp.se6.sg.chapter3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * A catch clause cannot catch an exception that is a child class of an earlier catch clause. Otherwise, compile error.
 */
public class CatchChildException {
    public void readFromFile(String fileName) {
        try {
            FileReader fis = new FileReader(fileName);
            System.out.println(fileName + " was found");
            char data = (char) fis.read();
            System.out.println("Just read: " + data);
        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
//        } catch (FileNotFoundException e) { //Compile Error: exception java.io.FileNotFoundException has already been caught
//            System.out.println("Oops - file not found: " + e.getMessage());
        }
        System.out.println("End of readFromFile");
    }

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader();
        reader.readFromFile("mydata.txt");
        System.out.println("End of main");
    }

}
