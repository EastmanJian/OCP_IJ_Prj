package edu.exam.ocp.se6.sg.chapter4.review.q19;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Q19 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
            String s = "75%";
            double d = (Double) nf.parse(s);
            System.out.println(d); // -> 0.75
        } catch (ParseException e) {
            System.out.println("Something failed");
        }
    }

}
