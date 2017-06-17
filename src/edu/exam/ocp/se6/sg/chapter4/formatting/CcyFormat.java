package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Example of NumberFormat.format()
 */
public class CcyFormat {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double c = 59.99321;
        System.out.println(cf.format(c));
    }
}

/* ->
59,99 €
*/
