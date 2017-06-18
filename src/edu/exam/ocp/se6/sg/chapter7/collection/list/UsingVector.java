package edu.exam.ocp.se6.sg.chapter7.collection.list;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;

public class UsingVector {
    public static void main(String[] args) throws ParseException {
        Vector<Date> december = new Vector<>();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        december.add(df.parse("Dec 1, 2017"));
        december.add(df.parse("Dec 5, 2017"));
        december.add(null); //Vector allows null elements
        for (Date d : december) {
            System.out.println((d==null)?null:df.format(d));
        }
    }
}

/* ->
Dec 1, 2017
Dec 5, 2017
null
*/