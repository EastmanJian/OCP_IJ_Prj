package edu.exam.ocp.se6.pe.pe4.q18;

import java.io.*;

public class Uboat {
    public static void main(String[] args) {
        try {
            File f1 = new File("sub1");
            f1.mkdir(); //create dir, if exists return false
            File f2 = new File(f1, "sub2"); //this won't create a new file, but a instance under sub1 dir
            File f3 = new File(f1, "sub3"); //this won't create a new file, but a instance under sub1 dir
            PrintWriter pw = new PrintWriter(f3); //If the file exists then it will be truncated to zero size; otherwise, a new file will be created.
        } catch (Exception e) {
            System.out.println("ouch");
        }
    }
}