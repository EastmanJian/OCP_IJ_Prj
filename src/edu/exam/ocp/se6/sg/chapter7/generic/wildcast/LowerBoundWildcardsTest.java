package edu.exam.ocp.se6.sg.chapter7.generic.wildcast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardsTest {
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
        Exception e4 = new Exception("Problem 4");
        Exception e5 = new SQLException("Problem 5");
        exceptions.add(e1);
        exceptions.add(e2);
        exceptions.add(e3);
        //exceptions.add(e4); //compile error: ArrayList.add(capture#1 of ? super IOException) is not applicable (argument mismatch; java.lang.Exception cannot be converted to capture#1 of ? super java.io.IOException)
        //exceptions.add(e5); //(same as above)
        showExceptions(exceptions);
    }


}

/* Why there will be compile errors on line 26,27? See comment on UpperBoundWildcardsTest. The reason is similar.
 */