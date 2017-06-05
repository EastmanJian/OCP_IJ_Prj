package edu.exam.ocp.se6.sg.chapter2.inst.initializer;

/**
 * Example of static initializer
 */

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class MyNumberFormatter {
    public static DecimalFormat df;
    public static NumberFormat nf;

    static {
        Locale locale = new Locale("de"); //German
        nf = NumberFormat.getInstance(locale);
        df = new DecimalFormat("#,### .00");
    }
}