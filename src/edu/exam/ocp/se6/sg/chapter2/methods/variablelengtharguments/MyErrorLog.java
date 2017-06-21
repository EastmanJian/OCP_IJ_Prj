package edu.exam.ocp.se6.sg.chapter2.methods.variablelengtharguments;

/**
 * Example of Variable-length Arguments
 */

import java.io.*;
import java.util.Date;

public class MyErrorLog {
    private PrintWriter out;

    public MyErrorLog(String fileName) {
        try {
            out = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logErrors(Date timeStamp, String... errors) {
        out.print(timeStamp + ":");
        for (String error : errors) {
            out.print(error + ", ");
        }
        out.println();
        out.flush();
    }

    public void finalize() {
        out.close();
    }

    public static void main(String[] args) {
        Date now = new Date();
        MyErrorLog m = new MyErrorLog("d:\\temp\\errors.txt");
        m.logErrors(now); //The array is empty with this method call
        m.logErrors(now, "Problem #1");
        m.logErrors(now, "a", "b", "c", "d", "e", "f");
        String[] array = {"does", "this", "work?"};
        m.logErrors(now, array);
    }
}

/* error.txt ->
Tue Jun 20 17:02:54 CST 2017:
Tue Jun 20 17:02:54 CST 2017:Problem #1,
Tue Jun 20 17:02:54 CST 2017:a, b, c, d, e, f,
Tue Jun 20 17:02:54 CST 2017:does, this, work?,
*/