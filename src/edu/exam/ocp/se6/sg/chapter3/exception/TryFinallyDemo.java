package edu.exam.ocp.se6.sg.chapter3.exception;

import java.io.FileReader;
import java.io.IOException;

/**
 * try-finally does not affect the Handle or Declare Rule, you still need to catch or declare the checked exception.
 */
public class TryFinallyDemo {
    public void readFromFile(String fileName) {
        try {
//            FileReader fis = new FileReader(fileName); //compile error: FileNotFoundException; must be caught or declared to be thrown.
            System.out.println(fileName + " was found");
//            char data = (char) fis.read();
//            System.out.println("Just read: " + data);
        } finally {
            System.out.println("Finally: Something went wrong");
        }
        System.out.println("End of readFromFile");
    }

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader();
        reader.readFromFile("mydata.txt");
        System.out.println("End of main");
    }

}
