package edu.exam.ocp.se6.sg.chapter4.formatting;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Example of DecimalFormat.format()
 */
public class FormatDecimalWithLocale {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        if(nf instanceof DecimalFormat) {
            DecimalFormat df = (DecimalFormat) nf;
            df.applyPattern("##,#00.00#");
            double d1 = 23184.348;
            double d2 = 3.1;
            System.out.println(df.format(d1));
            System.out.println(df.format(d2));
        }    }
}

/* ->
23.184,348
03,10
*/
