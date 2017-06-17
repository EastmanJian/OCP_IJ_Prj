package edu.exam.ocp.se6.sg.chapter3.exception;

public class StackOverflowDemo {
    private int x = 0;

    public void go() {
        System.out.println(++x);
        go();
    }

    public static void main(String[] args) {
        new StackOverflowDemo().go();
    }
}

/* ->
1
2
.
.
.
5622
5623
5624
5625
Exception in thread "main" java.lang.StackOverflowError
        at sun.nio.cs.ext.DoubleByte$Encoder.encodeArrayLoop(Unknown Source)
        at sun.nio.cs.ext.DoubleByte$Encoder.encodeLoop(Unknown Source)
        at java.nio.charset.CharsetEncoder.encode(Unknown Source)
        at sun.nio.cs.StreamEncoder.implWrite(Unknown Source)
        at sun.nio.cs.StreamEncoder.write(Unknown Source)
        at java.io.OutputStreamWriter.write(Unknown Source)
        at java.io.BufferedWriter.flushBuffer(Unknown Source)
        at java.io.PrintStream.newLine(Unknown Source)
        at java.io.PrintStream.println(Unknown Source)
        at edu.exam.ocp.se6.sg.chapter3.exception.StackOverflowDemo.go(StackOverflowDemo.java:7)
        at edu.exam.ocp.se6.sg.chapter3.exception.StackOverflowDemo.go(StackOverflowDemo.java:8)
        at edu.exam.ocp.se6.sg.chapter3.exception.StackOverflowDemo.go(StackOverflowDemo.java:8)
        at edu.exam.ocp.se6.sg.chapter3.exception.StackOverflowDemo.go(StackOverflowDemo.java:8)
        at edu.exam.ocp.se6.sg.chapter3.exception.StackOverflowDemo.go(StackOverflowDemo.java:8)
        ...
        at edu.exam.ocp.se6.sg.chapter3.exception.StackOverflowDemo.go(StackOverflowDemo.java:8)
*/