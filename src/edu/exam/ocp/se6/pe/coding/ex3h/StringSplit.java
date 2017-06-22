package edu.exam.ocp.se6.pe.coding.ex3h;

public class StringSplit {
    public static void main(String[] args) {
        String in = "3.14, 0x17-5b, cat.dog.";
        String [] splited = in.split("[.,]\\s?");
        for(String x : splited) {
            System.out.println(x);
        }
        /* ->
        3
        14
        0x17-5b
        cat
        dog
        */
    }
}
