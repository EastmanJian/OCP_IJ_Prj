package edu.exam.ocp.se6.pe.sat2.q05;

import java.text.*;
public class Gazillion {
    public static void main(String[] args) throws Exception {
        String s = "123.45678xyz";
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse(s));  // -> 123.456
        System.out.println("-------------");
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(2);
//        System.out.println(nf.format(s)); //Runtime Exception: IllegalArgumentException: Cannot format given Object as a Number
        System.out.println(nf.format(456.7890123)); // -> 456.79

        //Tests
        System.out.println("------Tests-------");
        System.out.println(nf.parse("789qwer")); // -> 789
//        System.out.println(nf.parse("abc987"));  //Runtime Exception: ParseException: Unparseable number: "abc987".
//        System.out.println(nf.parse("abc"));  //Runtime Exception: ParseException: Unparseable number: "abc"

    }
}

/*
public Number parse(String source)
            throws java.text.ParseException
Parses text from the beginning of the given string to produce a number. The method may not use the entire text of the given string.
See the parse(String, ParsePosition) method for more information on number parsing.


public abstract Number parse(String source,
                             ParsePosition parsePosition)
Returns a Long if possible (e.g., within the range [Long.MIN_VALUE, Long.MAX_VALUE] and with no decimals), otherwise a Double. If IntegerOnly is set, will stop at a decimal point (or equivalent; e.g., for rational numbers "1 2/3", will stop after the 1). Does not throw an exception; if no object can be parsed, index is unchanged!

In the console output of IntelliJ, the Exception and stdout sequence will be changed. use Thread.sleep() to make it in order.
 */