package edu.exam.ocp.se6.pe.sat1.q13;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

public class FormatOutput {
    public static void main(String[] args) {
        boolean b = false;
        int i = 7;
        double d = 1.23;
        float f = 4.56f;

        System.out.printf(" %b\n", b); // -> false
//        System.out.printf(" %i", i); //runtime exception: UnknownFormatConversionException: Conversion = 'i'
//        System.out.format(" %d", d); //runtime exception: IllegalFormatConversionException: d != java.lang.Double
        System.out.format(" %d", i); // -> 7
        System.out.format(" %f %n%n", f); // -> 4.560000

        Calendar c = Calendar.getInstance();
        String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
        System.out.println(s); // -> Duke's Birthday: 06 30,2017

        System.out.format("%4$s %3$s %2$s %1$s %4$s %3$s %2$s %1$s \n\n", "a", "b", "c", "d");

        long x = -123456789012l;
        short y = 22766; //maximum value of a short is 32767
        System.out.printf("%1$+20d %n %2$010d %n", x, Short.MAX_VALUE - y); //->        -123456789012  \n   0000010001
        System.out.println(new Date()); // -> Fri Jun 30 23:05:30 CST 2017


        PrintWriter out = new PrintWriter(System.out);
        double d1 = 0.1/0.3;
        String intro = "d1 = ";
        out.format("%s%7.3f", intro, d1); // -> d1 =   0.333
        out.flush();
    }
}
