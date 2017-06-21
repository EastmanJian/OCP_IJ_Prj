package edu.exam.ocp.se6.sg.chapter2.methods.javabeans;

/**
 * Example of JavaBean naming convention.
 */

import java.util.GregorianCalendar;

public class Employee implements java.io.Serializable {
    private String first, last; //the field name might not be the same as the property name
    private GregorianCalendar hireDate;
    public double salary;
    private boolean fullTime;

    public String getFirstName() { //firstName: A read-only String property
        return first;
    }

    public void setLastName(String s) { //lastName: A String property
        last = s;
    }

    public String getLastName() {
        return last;
    }

    public GregorianCalendar getHireDate() { //hireDate: A GregorianCalendar property
        return hireDate;
    }

    public void setHireDate(GregorianCalendar hd) {
        hireDate = hd;
    }

    public void setFullTime(boolean fullTime) { //fullTime: A boolean property
        this.fullTime = fullTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }
}