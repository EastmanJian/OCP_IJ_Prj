package edu.exam.ocp.se6.pe.pe1.q21;

/**
 * Example of File.list()
 * It returns an array of strings naming the files and directories in the directory denoted by The File object.
 */
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class Dir {
    public static void main(String[] args) throws IOException {
        String[] files;
        File dir = new File(args[0]);
        files = dir.list();
        File file;
        DateFormat dtf = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        for (String fileName: files) {
            file = new File(args[0] + File.separator + fileName);
            String isFolder = file.isDirectory()? "<DIR>":"";
            System.out.printf("%,20d %25s %s %s\n", file.length(), dtf.format(new Date(file.lastModified())), fileName, isFolder);
        }
        System.out.println("Total " + files.length + " files.");
    }
}
