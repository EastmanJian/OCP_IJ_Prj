package edu.exam.ocp.se6.sg.chapter4.formatting;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Example of DateFormat.format()
 */
public class FormatDate {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat full = DateFormat.getDateInstance(DateFormat.FULL);
        Date d = new Date(444444444000L);
        System.out.println(df.format(d));
        System.out.println(full.format(d));
        System.out.println();

        DateFormat dtf = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL);
        System.out.println(dtf.format(d));
        System.out.println();

        DateFormat de = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, Locale.GERMANY);
        System.out.println(de.format(d));
    }
}

/* ->
01/02/84
Wednesday, 1 February 1984

01-Feb-1984 08:47:24 o'clock CST

01.02.1984 08:47 Uhr CST
*/
