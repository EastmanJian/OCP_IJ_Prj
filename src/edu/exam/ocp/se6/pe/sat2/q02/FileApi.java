package edu.exam.ocp.se6.pe.sat2.q02;

import java.io.File;

public class FileApi {
    public static void main(String[] args) {
        String name = "testDir" + File.pathSeparator + "subDir2"
                + File.pathSeparator + "Shackelton.txt";
        File f = new File(name);
        System.out.println("exists " + f.exists());    }
}
