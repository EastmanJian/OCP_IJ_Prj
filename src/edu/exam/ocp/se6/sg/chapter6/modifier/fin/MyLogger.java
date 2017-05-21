package edu.exam.ocp.se6.sg.chapter6.modifier.fin;

import java.io.File;

public final class MyLogger {
    private final File DEST; //blank final

    public MyLogger(File d) {
        DEST = d;
    }

    public void logMessage(final String MESSAGE) {
        final long TIME = new java.util.Date().getTime();
        //write time and message to file...
    }
}