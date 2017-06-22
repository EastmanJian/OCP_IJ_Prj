package edu.exam.ocp.se6.sg.chapter4.regexp;

public class StringSplit {
    public static void main(String[] args) {
        String greetings = "hi;hello;welcome";
        String [] greetingsArray = greetings.split(";");
        for(String greeting : greetingsArray) {
            System.out.println(greeting);
        }
        /* ->
        hi
        hello
        welcome
        */

        String data = "3035551212,123 Main St.\tDenver,CO:50431";
        String [] results = data.split("[;,:\\t]");
        for(String result : results) {
            System.out.println(result);
        }
        /* ->
        3035551212
        123 Main St.
        Denver
        CO
        50431
        */

        String s = "abc,def,g,hi,jklm,o";
        String [] array = s.split(",", 3);
        for(String x : array) {
            System.out.println(x);
        }
        /* ->
        abc
        def
        g,hi,jklm,o
        */

    }
}
