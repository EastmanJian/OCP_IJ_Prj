package edu.exam.ocp.se6.sg.chapter4.formatting;


import java.text.DecimalFormat;

/**
 * Example of DecimalFormat.format()
 */
public class FormatDecimal {
    public static void main(String[] args) {
        double d = 1234567.437;
        DecimalFormat one = new DecimalFormat("###,###,###.###");
        System.out.println(one.format(d));
        DecimalFormat two = new DecimalFormat("000,000,000.00000");
        System.out.println(two.format(d));
        DecimalFormat three = new DecimalFormat("$#,###,###.##");
        System.out.println(three.format(d));
    }
}

/* ->
1,234,567.437
001,234,567.43700
$1,234,567.44
*/
