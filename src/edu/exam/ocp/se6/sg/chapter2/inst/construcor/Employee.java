package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

/**
 * Example using this in constructor
 */

import java.util.Date;

public class Employee {
    private String firstName, lastName;
    private Date hireDate;

    public Employee(String fn, String ln) {
        this(fn, ln, new Date());
        System.out.println("Inside first constructor");
    }

  /*  The constructor below has the same function as the constructor above.
      The constructor above uses this to avoid repeating codes.
   */
//    public Employee(String fn, String ln) {
//        firstName = fn;
//        lastName = ln;
//        hireDate = new Date();
//    }

    public Employee(String fn, String ln, Date hd) {
        System.out.println("Inside second constructor");
        firstName = fn;
        lastName = ln;
        hireDate = hd;
    }
}