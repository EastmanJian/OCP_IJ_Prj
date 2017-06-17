package edu.exam.ocp.se6.sg.chapter7.generic.limitation;

import java.util.ArrayList;

/**
 * Advantage generic Collections
 *   - generics allow issues like this one to be discovered at compile time.
 *   - you do not need to cast the data when accessing elements in the collection.
 */
public class UseGeneric {
    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("java");
        keywords.add("certification");
        keywords.add("exam");
        //keywords.add(new java.util.Date()); //Compile Error: no suitable method found for add(java.util.Date)
        for(String x : keywords) {
            //String temp = (String) x; //casting is not required
            System.out.println(x.toUpperCase());
        }
    }
}
