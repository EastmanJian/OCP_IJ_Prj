package edu.exam.ocp.se6.pe.pe1.q21;

/**
 * Example of File.list()
 * It returns an array of strings naming the files and directories in the directory denoted by The File object.
 */

import java.io.*;

public class Finder {
    public static void main(String[] args) throws IOException {
        String[] files;
        File dir = new File(args[0]);
        files = dir.list();
        System.out.println(files.length);
    }
}
/*
C:\>dir D:\temp\build
 Volume in drive D is 256G_SSD
 Volume Serial Number is 3615-522C

 Directory of D:\temp\build

2017-06-14  23:46    <DIR>          .
2017-06-14  23:46    <DIR>          ..
2017-06-14  23:07    <DIR>          edu
2017-06-14  23:46             3,086 myproject.jar
               1 File(s)          3,086 bytes
               3 Dir(s)  176,308,035,584 bytes free

C:\>java edu.exam.ocp.se6.pe.pe1.q21.Finder D:\temp\build
2

*/