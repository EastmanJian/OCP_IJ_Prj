package edu.exam.ocp.se6.sg.chapter3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Catch or Declare Rule
 */
public class CatchOrDeclare {
    public void readFromFileCatch(String fileName) {
        try {
            FileReader f = new FileReader(fileName);
            System.out.println(fileName + " was found");
            char data = (char) f.read();
            System.out.println("Just read: " + data);
        } catch (IOException e) { //Compile Error: exception java.io.FileNotFoundException has already been caught
            System.out.println("Oops - file not found: " + e.getMessage());
        }
        System.out.println("End of readFromFile");
    }

    public void readFromFileDeclare(String fileName) throws IOException {
        FileReader fis = new FileReader(fileName);
        System.out.println(fileName + " was found");
        char data = (char) fis.read();
        System.out.println("Just read: " + data);
        System.out.println("End of readFromFile");
    }

}
