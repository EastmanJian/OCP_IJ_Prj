package edu.exam.ocp.se6.sg.chapter4.file;

import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb); //StringBuilder is an Appendable. Formatter's constructor accepts an Appendable.
                                           //The Formatter writes its output to a StringBuilder object.
        double d = 0.1/0.3;
        int x = 123;
        fmt.format("d=%5.3f and x=%6d", d, x);
        System.out.println(sb.toString());
    }
}

/* ->
d=0.333 and x=   123
*/