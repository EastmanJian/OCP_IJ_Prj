package edu.exam.ocp.se6.sg.chapter1.datatype.ref;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Example of assigning compatible references.
 */

public class C extends P {
    void test0() {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = a1;
        BigDecimal bd = new BigDecimal(38347820293823453244.23432);
        String str;
//        str = bd;  //Compile Error: incompatible types: BigDecimal cannot be converted to String
    }

    void test1() {
        C c = new C();
        P p = new P();
        p = c;
    }

    void test2() {
        C c = new C();
        P p = new P();
//        c = p; //Compile Error: incompatible types: P cannot be converted to C
        c = (C) p;
    }
}
