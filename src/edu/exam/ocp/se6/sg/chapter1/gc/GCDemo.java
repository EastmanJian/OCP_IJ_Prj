package edu.exam.ocp.se6.sg.chapter1.gc;

import java.util.GregorianCalendar;

/**
 * Know When an Object Is Eligible for Garbage Collection
 */
public class GCDemo {
    public static void main(String[] args) {
        GregorianCalendar christmas, newyears;
        christmas = new GregorianCalendar(2009, 12, 25);
        newyears = new GregorianCalendar(2010, 1, 1);

        christmas = newyears;  //the christmas reference is assigned to newyears, which results in no more references pointing to the object 2009-12-25. So this object immediately becomes available for garbage collection.
        GregorianCalendar d = christmas; //Three references: newyears, christmas, d are pointing to object 2010-1-1.
        christmas = null; //newyears and d are still pointing to object 2010-1-1.
    } //the main method ends and both d and newyears go out of scope. Therefore, the object 2010-1-1 becomes eligible for garbage collection.
}