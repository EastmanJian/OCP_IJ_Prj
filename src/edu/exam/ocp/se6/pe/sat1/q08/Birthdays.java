package edu.exam.ocp.se6.pe.sat1.q08;

import java.util.*;

public class Birthdays {
    public static void main(String[] args) {
        Map<Friends, String> hm = new HashMap<Friends, String>();
        hm.put(new Friends("Charis"), "Summer 2009");
        hm.put(new Friends("Draumur"), "Spring 2002");
        Friends f = new Friends(args[0]);
        System.out.println(hm.get(f));
    }
}