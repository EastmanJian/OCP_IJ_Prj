package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Example of NumberFormat.format()
 * Note that the decimal points will be rounded.
 */
public class PercentFormat {
    public static void main(String[] args) {
        NumberFormat pf = NumberFormat.getPercentInstance();
        double p = 0.47;
        System.out.println(pf.format(p)); // -> 47%

        p = 3.1415;
        System.out.println(pf.format(p)); // -> 314%
    }
}
