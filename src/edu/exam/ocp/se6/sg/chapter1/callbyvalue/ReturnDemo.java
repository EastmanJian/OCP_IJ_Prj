package edu.exam.ocp.se6.sg.chapter1.callbyvalue;

/**
 * Example of Return by Value.
 * The local variable file in main gets a copy of f when getFile returns.
 */

import java.io.File;

public class ReturnDemo {
    public File getFile(String fileName) {
        File f = new File(fileName);
        return f;
    }

    public static void main(String[] args) {
        ReturnDemo demo = new ReturnDemo();
        File file = demo.getFile(args[0]);
        if (file.exists()) {
            System.out.println(file.getName() + " file exists");
        } else {
            System.out.println(file.getName() + " doesn’t exist");
        }
        file = null; //The File object created in the getFile method does not become eligible for garbage collection until here.
    }
}