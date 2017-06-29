package edu.exam.ocp.se6.sg.chapter7.generic.bounded;

import java.io.*;

public class Hello<T extends IOException> {
    private T hello;
    public Hello() { hello = null;}
    public static void main(String[] args) {
        Hello<FileNotFoundException> h1 = new Hello<FileNotFoundException>();
        Hello<IOException> h2 = new Hello<>();
//        Hello<Exception> h3 = new Hello<Exception>(); //Compile Error: type argument Exception is not within bounds of type-variable T
        Hello<FileNotFoundException> h4 = new Hello(); //compiles ok with warning: unchecked assignment
        Hello h5 = new Hello<IOException>(); //compiles ok with warning: found raw type
//        Hello<IOException> h7 = new Hello<FileNotFoundException>(); //Compile Error : incompatible types
//        Hello<FileNotFoundException> h7 = new Hello<InterruptedIOException>(); //Compile Error : incompatible types
    }
}

