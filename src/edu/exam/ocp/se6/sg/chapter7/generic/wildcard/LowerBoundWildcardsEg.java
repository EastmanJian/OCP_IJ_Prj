package edu.exam.ocp.se6.sg.chapter7.generic.wildcard;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardsEg {
    public static void showExceptions(List< ? super IOException > list) {
        for(Object e : list) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList < ? super IOException > exceptions = new ArrayList < Exception >();
        IOException e1 = new IOException("Problem 1");
        IOException e2 = new IOException("Problem 2");
        FileNotFoundException e3 = new FileNotFoundException("Problem 3");
        exceptions.add(e1);
        exceptions.add(e2);
        exceptions.add(e3);
        showExceptions(exceptions);


    }


}
