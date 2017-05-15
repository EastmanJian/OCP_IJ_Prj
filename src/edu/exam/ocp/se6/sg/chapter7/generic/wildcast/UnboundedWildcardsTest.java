package edu.exam.ocp.se6.sg.chapter7.generic.wildcast;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardsTest {
    public static <T> void printList(List<T> list) {
        for (T x : list) {
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
