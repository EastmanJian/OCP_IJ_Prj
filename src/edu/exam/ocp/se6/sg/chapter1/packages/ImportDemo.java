package edu.exam.ocp.se6.sg.chapter1.packages;

/**
 * common practice in Java is to avoid using the wildcard because it may lead to ambiguity when two packages are
 * imported that share a common class name. For example, the following code does not compile because there is a class
 * called AttributeList in both the javax.swing.text.html.parser package and the javax.management package:
 */

import javax.swing.text.html.parser.*;
import javax.management.*;

public class ImportDemo {
//    public AttributeList a; //Comile Error: reference to AttributeList is ambiguous both class javax.management.AttributeList in javax.management and class javax.swing.text.html.parser.AttributeList in javax.swing.text.html.parser match.
}