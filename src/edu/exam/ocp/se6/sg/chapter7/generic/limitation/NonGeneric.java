package edu.exam.ocp.se6.sg.chapter7.generic.limitation;

import java.util.ArrayList;

/**
 * Limitations of Nongeneric Collections
 */
public class NonGeneric {
    public static void main(String[] args) {
        ArrayList keywords = new ArrayList();
        keywords.add("java");
        keywords.add("certification");
        keywords.add("exam");
        keywords.add(new java.util.Date());
        for(Object x : keywords) {
            String temp = (String) x;
            System.out.println(temp.toUpperCase());
        }
    }
}

/* ->
JAVA
CERTIFICATION
EXAM
Exception in thread "main"
        java.lang.ClassCastException: java.util.Date cannot be cast to java.lang.String
        at edu.exam.ocp.se6.sg.chapter7.generic.limitation.NonGeneric.main(NonGeneric.java:16)
*/