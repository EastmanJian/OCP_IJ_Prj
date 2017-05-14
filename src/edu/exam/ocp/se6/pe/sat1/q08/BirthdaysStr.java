package edu.exam.ocp.se6.pe.sat1.q08;

import java.util.HashMap;
import java.util.Map;

public class BirthdaysStr {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("Charis", "Summer 2009");
        hm.put("Draumur", "Spring 2002");
        String f = args[0];
        System.out.println(hm.get(f));
    }
}