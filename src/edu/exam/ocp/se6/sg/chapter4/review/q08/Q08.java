package edu.exam.ocp.se6.sg.chapter4.review.q08;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * number will be rounded while formatting currency.
 */
public class Q08 {
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
        float f = 99.999F;
        System.out.println(fmt.format(f)); // -> $100.00
    }
}
