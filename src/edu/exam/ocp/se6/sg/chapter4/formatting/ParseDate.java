package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Example of NumberFormat.parse()
 * The parse method only parses the beginning of a string. After it reaches a character that cannot be parsed,
 * the parsing stops and the value is returned.
 */
public class ParseDate {
    public static void main(String[] args) {
        DateFormat shortFormat = DateFormat.getDateInstance(
                DateFormat.SHORT,
                Locale.US);
        String s = "01/31/1984";
        try {
            Date date = shortFormat.parse(s);
            DateFormat fullFormat = DateFormat.getDateInstance(
                    DateFormat.FULL,
                    Locale.FRANCE);
            System.out.println(fullFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/* ->
mardi 31 janvier 1984
*/

