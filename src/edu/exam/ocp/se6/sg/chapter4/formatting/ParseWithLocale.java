package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Example of NumberFormat.parse()
 */
public class ParseWithLocale {
    public static void main(String[] args) {
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            String s = "123,45";
            System.out.println(en.parse(s));
            System.out.println(fr.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/* ->
12345
123.45
*/
