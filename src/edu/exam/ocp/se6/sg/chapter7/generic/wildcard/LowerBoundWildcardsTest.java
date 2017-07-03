package edu.exam.ocp.se6.sg.chapter7.generic.wildcard;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardsTest {
    public static void showExceptions(List<? super IOException> list) {
        for (Object e : list) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<? super IOException> exceptions = new ArrayList<Exception>();
        IOException e1 = new IOException("Problem 1");
        IOException e2 = new IOException("Problem 2");
        FileNotFoundException e3 = new FileNotFoundException("Problem 3");
        Exception e4 = new Exception("Problem 4");
        Exception e5 = new SQLException("Problem 5");
        exceptions.add(e1);
        exceptions.add(e2);
        exceptions.add(e3);
//        exceptions.add(e4);
//        exceptions.add(e5);
        showExceptions(exceptions);
    }


}

/*
Compile Errors
Error:(26, 19) java: no suitable method found for add(java.lang.Exception)
    method java.util.ArrayList.add(capture#1 of ? super java.io.IOException) is not applicable
      (argument mismatch; java.lang.Exception cannot be converted to capture#1 of ? super java.io.IOException)
Error:(27, 19) java: no suitable method found for add(java.lang.Exception)
    method java.util.ArrayList.add(capture#2 of ? super java.io.IOException) is not applicable
      (argument mismatch; java.lang.Exception cannot be converted to capture#2 of ? super java.io.IOException)
 */


/*
Why there will be compile errors on line 26,27? See comment on UpperBoundWildcardsTest. The reason is similar.
Because the lower-bound generic type in ArrayList <? super IOException> can be IOException, Exception, Throwable or Object, if you add an Exception or SQLException objects to exceptions, in case the exceptions type is IOException, it cannot be used to reference these objects.
But it is possible that you pre-initiate a ArrayList<Exception> object and assign to exceptions. See class LowerBoundWildcardsTest1.
 */