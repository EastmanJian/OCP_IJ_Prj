package edu.exam.ocp.se6.pe.pe2.q43;

import java.util.*;

public class Wise {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1999, 11, 25); //month starts from 0 (Jan)
        System.out.println(c.getTime()); // -> Sat Dec 25 13:42:22 CST 1999
        c.roll(Calendar.MONTH, 3); // roll() will not change larger fields
        c.add(Calendar.DATE, 10); // add() add time base on calendar's rule
        System.out.println(c.getTime()); // -> Sun Apr 04 13:42:22 CST 1999
    }
}