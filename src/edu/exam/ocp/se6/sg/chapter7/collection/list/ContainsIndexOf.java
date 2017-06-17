package edu.exam.ocp.se6.sg.chapter7.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List operation example using ArrayList
 */
public class ContainsIndexOf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("OH");
        list.add("CO");
        list.add("NE");
        list.add("NJ");
        String state = list.get(2);
        System.out.println(state);
        if (list.contains("CO")) {
            System.out.println(list.indexOf("CO"));
        }
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        list.clear();
        System.out.println(list.size());
    }
}

/*
NE
1
OH
CO
NE
NJ
0
*/