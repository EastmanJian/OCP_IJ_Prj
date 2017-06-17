package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Example of NumberFormat.parse()
 */
public class ParseCcy {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
        try {
            String amt = "$12,345.99";
            double value = (Double) cf.parse(amt);
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/* ->
12345.99
*/
