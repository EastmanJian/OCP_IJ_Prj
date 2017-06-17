package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * 	A return causes a method to immediately get popped off the method call stack.
 * 	However, if there is a finally  block, the return gets put on hold until the finally block finishes.
 */

import java.io.*;

public class FinallyDemo {
    public void readFromFile(String fileName) {
        System.out.println("Inside readFromFile");
        FileReader fis = null;
        try {
            fis = new FileReader(fileName);
            char data = (char) fis.read();
            System.out.println("Just read: " + data);
        } catch (IOException e) {
            System.out.println("Handler for IOException");
            System.out.println(e.getMessage());
            return;
        } finally {
            System.out.println("Inside finally block");
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
            }
        }
        System.out.println("End of readFromFile");
    }

    public static void main(String[] args) {
        FinallyDemo reader = new FinallyDemo();
        reader.readFromFile("mydata.txt");
        System.out.println("End of main");
    }
}

/* ->
Inside readFromFile
Handler for IOException
mydata.txt (The system cannot find the file specified)
Inside finally block
End of main
*/