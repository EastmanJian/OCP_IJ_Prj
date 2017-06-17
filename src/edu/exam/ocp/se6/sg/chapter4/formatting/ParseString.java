package edu.exam.ocp.se6.sg.chapter4.formatting;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Example of NumberFormat.parse()
 * The parse method only parses the beginning of a string. After it reaches a character that cannot be parsed,
 * the parsing stops and the value is returned.
 */
public class ParseString {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        try {
            String one = "456abc";
            String two = "-2.5165e10";
            String three = "x85 .3";
            System.out.println(nf.parse(one));
            System.out.println(nf.parse(two));
            System.out.println(nf.parse(three));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/* ->
456
-2.5165
java.text.ParseException: Unparseable number: "x85 .3"
*/
