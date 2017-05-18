package edu.exam.ocp.se6.sg.chapter7.generic.bounded;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Hello<T extends List> {
    public static void main(String[] args) {
        Hello<ArrayList> h1 = new Hello<ArrayList>();
        Hello<Stack> h2 = new Hello<Stack>();
//        Hello<HashMap> h3 = new Hello<HashMap>();
    }
}

/*
Compile output:
Error:(12) java: type argument java.util.HashMap is not within bounds of type-variable T
 */