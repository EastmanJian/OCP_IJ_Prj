package edu.exam.ocp.se6.sg.chapter6.modifier.fin;

import java.io.File;

public final class MyLogger {
    private final File DEST; //blank final
    private final String STR; //blank final
    private static final String STATIC_STR; //static blank final

    static { STATIC_STR = "hello"; }

    public MyLogger(File d) {
        DEST = d;
    }
    { STR = "this is my logger"; }

    public void logMessage(final String MESSAGE) {
        final long TIME = new java.util.Date().getTime();
        //write time and message to file...
    }
}