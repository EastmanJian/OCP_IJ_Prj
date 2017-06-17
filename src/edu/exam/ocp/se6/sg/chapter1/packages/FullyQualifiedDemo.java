package edu.exam.ocp.se6.sg.chapter1.packages;

/**
 * If you need to use two classes with the same name but in different packages, then using imports does not work.
 * You will need to use their fully qualified name in your source file.
 */
public class FullyQualifiedDemo {
    public javax.management.AttributeList a1;
    public javax.swing.text.html.parser.AttributeList a2;
}