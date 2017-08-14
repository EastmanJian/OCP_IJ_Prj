package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

/**
 * Example using this in constructor
 */

import java.util.Date;

public class Worker {
    private String firstName, lastName;
    private Date hireDate;

    public Worker(String fn, String ln) {
        System.out.println("Inside first constructor");
//        Worker(fn, ln, new Date()); //compile error: because Worker(String, String, Date) is not a method.
    }


    public Worker(String fn, String ln, Date hd) {
        System.out.println("Inside second constructor");
        firstName = fn;
        lastName = ln;
        hireDate = hd;
    }
}