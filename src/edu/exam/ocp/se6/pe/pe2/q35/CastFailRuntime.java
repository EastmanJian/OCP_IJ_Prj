package edu.exam.ocp.se6.pe.pe2.q35;

import java.sql.Time;
import java.util.Date;

public class CastFailRuntime {
    public static void main(String[] args) {
        //Given Time extends Date
        Date date = new Time(55555l); //compiles fine, run fine.

        Date d = new Date();
        Time t = (Time) d; //compiles fine, but ClassCastException at runtime, the compiler cannot detect in compile time.

        String s = "true";
//        Boolean b = (Boolean) s; //compile Error: incompatible types: java.lang.String cannot be converted to java.lang.Boolean
    }
}
