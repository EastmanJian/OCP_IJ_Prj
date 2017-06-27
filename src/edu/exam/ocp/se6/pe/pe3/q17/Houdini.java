package edu.exam.ocp.se6.pe.pe3.q17;

public class Houdini {
    public static void main(String[] args) throws Exception {
        throw new MyException();
//        System.out.println("success"); //compile Error: unreachable statement
    }
}