package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Example of NumberFormat methods - getDateInstance(style, locale), parse(), format()
 *                         constants - DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.FULL
 * The parse method only parses the beginning of a string. After it reaches a character that cannot be parsed,
 * the parsing stops and the value is returned.
 */
public class ParseDate {
    public static void main(String[] args) {
        DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        String s = "01/31/1984xxxx" ; //result is the same if you use "1/31/84"
        Date date = null;
        try {
            date = shortFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        System.out.println(fullFormat.format(date)); // -> mardi 31 janvier 1984

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println(df.format(date)); // -> Tuesday, January 31, 1984
        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        System.out.println(df.format(date)); // -> Jan 31, 1984
        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println(df.format(date)); // -> 1/31/84
    }
}