package edu.exam.ocp.se6.sg.chapter7.generic.wildcast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardsTest1 {
    public static void showExceptions(List< ? super IOException > list) {
        for(Object e : list) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Exception> exceptions = new ArrayList < Exception >();
        IOException e1 = new IOException("Problem 1");
        IOException e2 = new IOException("Problem 2");
        FileNotFoundException e3 = new FileNotFoundException("Problem 3");
        Exception e4 = new Exception("Problem 4");
        Exception e5 = new SQLException("Problem 5");
        exceptions.add(e1);
        exceptions.add(e2);
        exceptions.add(e3);
        exceptions.add(e4);
        exceptions.add(e5);

        ArrayList < ? super IOException > e = exceptions;

        showExceptions(e);
    }


}

