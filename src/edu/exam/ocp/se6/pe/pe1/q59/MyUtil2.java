package edu.exam.ocp.se6.pe.pe1.q59;

import java.util.ArrayList;

class MyUtil2 {
    MyUtil go() {
        MyUtil m2 = new MyUtil();
        m2.add("1");
        m2.add("2");
        m2.add("3");
//        m2.removeRange(1, 2); //compile error: removeRange(int,int) has protected access in java.util.ArrayList
        return m2;
    }

    ArrayList go1() {
        ArrayList al = new ArrayList();
        al.add("1");
        al.add("2");
        al.add("3");
//        al.removeRange(1, 2);  //compile error: removeRange(int,int) has protected access in java.util.ArrayList
        return al;
    }

}