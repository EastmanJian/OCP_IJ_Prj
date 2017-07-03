package edu.exam.ocp.se6.sg.chapter7.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {
    public static void printList(List<?> list) {  //same as 'printList(List list)'
        for (Object x : list) {
            System.out.println(x.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("java");
        keywords.add("generics");
        keywords.add("collections");
        printList(keywords);
    }
}
/* ->
java
generics
collections
*/