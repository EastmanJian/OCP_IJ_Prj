package edu.exam.ocp.se6.sg.chapter1.review.q21;

//public static class HelloWorld { //compile error: modifier static not allowed here.
public class HelloWorld { //this compiles.
    public static void main(String [] args) {
        System.out.println(args[1] + args[2]);
    }
}