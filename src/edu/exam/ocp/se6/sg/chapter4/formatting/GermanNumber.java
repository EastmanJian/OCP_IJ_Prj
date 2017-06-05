package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Example of NumberFormat.format()
 */
public class GermanNumber {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        double d = 123.57;
        System.out.println(nf.format(d));
    }
}

/* -->
123,57
*/
