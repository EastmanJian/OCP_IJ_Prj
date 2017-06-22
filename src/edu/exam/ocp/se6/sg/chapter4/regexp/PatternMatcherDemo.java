package edu.exam.ocp.se6.sg.chapter4.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {
    public static void main(String[] args) {
        String regex;
        Pattern pattern;

        regex = "hello";
        pattern = Pattern.compile(regex);
        Matcher m1 = pattern.matcher("hello");
        Matcher m2 = pattern.matcher("goodbye");
        //A character sequence matches the regular expression "hello" only if the character sequence is "hello".
        if (m1.matches()) {
            System.out.println("hello is a match");
        }
        if (m2.matches()) {
            System.out.println("goodbye is a match");
        }
        /* ->
        hello is a match
        */

        regex = ".ing";
        pattern = Pattern.compile(regex);
        String[] tests = {"ing", "ring", "trying", "running", "beings"};
        for (String test : tests) {
            Matcher m = pattern.matcher(test);
            if (m.matches()) {
                System.out.println(test + " matches " + regex);
            }
        }
        /* ->
        ring matches .ing
         */

        regex = ".*ing";
        pattern = Pattern.compile(regex);
        for (String test : tests) {
            Matcher m = pattern.matcher(test);
            if (m.matches()) {
                System.out.println(test + " matches " + regex);
            }
        }
        /* ->
        ing matches .*ing
        ring matches .*ing
        trying matches .*ing
        running matches .*ing
        */

        regex = "[qrstuv]*.ing"; //equivalent to "[q-v]*.ing"
        pattern = Pattern.compile(regex);
        for (String test : tests) {
            Matcher m = pattern.matcher(test);
            if (m.matches()) {
                System.out.println(test + " matches " + regex);
            }
        }
        /* ->
        ring matches .*ing
        trying matches .*ing
        */

        Pattern p = Pattern.compile("[0-4]+[a-z]*[5-9]?");
        String[] values = {"4a", "112abc6", "2345", "01a", "a5", "4a56"};
        for (String value : values) {
            Matcher m = p.matcher(value);
            if (m.matches()) {
                System.out.println(value + " matches [0-4]+[a-z]*[5-9]?");
            }
        }
        /* ->
        4a matches [0-4]+[a-z]*[5-9]?
        112abc6 matches [0-4]+[a-z]*[5-9]?
        2345 matches [0-4]+[a-z]*[5-9]?
        01a matches [0-4]+[a-z]*[5-9]?
        */

        Pattern pat = Pattern.compile("(a*b)+");
        String[] str = {"ab", "abaabab", "babb", "01a", "abcab", "bbbbab"};
        for (String value : str) {
            Matcher m = pat.matcher(value);
            if (m.matches()) {
                System.out.println(value + " matches [0-4]+[a-z]*[5-9]?");
            }
        }
        /* ->
        ab matches [0-4]+[a-z]*[5-9]?
        abaabab matches [0-4]+[a-z]*[5-9]?
        babb matches [0-4]+[a-z]*[5-9]?
        bbbbab matches [0-4]+[a-z]*[5-9]?
        */

        String s = "[A-Z]\\w*\\s+[A-Z]\\w+";
        Pattern x = Pattern.compile(s);
        String [] names = {"John Doe", "JohnDoe", "John\tDoe", "John doe", "J D", "J D5"};
        for(String name: names) {
            Matcher m = x.matcher(name);
            if(m.matches()) {
                System.out.println(name + " matches " + s);
            }
        }
        /* ->
        John Doe matches [A-Z]\w*\s+[A-Z]\w+
        John	Doe matches [A-Z]\w*\s+[A-Z]\w+
        J D5 matches [A-Z]\w*\s+[A-Z]\w+
        */

    }
}

