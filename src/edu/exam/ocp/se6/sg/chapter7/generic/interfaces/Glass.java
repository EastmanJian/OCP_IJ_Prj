package edu.exam.ocp.se6.sg.chapter7.generic.interfaces;

public class Glass implements Breakable<String> {
    public void doBreak(String message) {
        System.out.println("Breaking a Glass: " + message);
    }
}