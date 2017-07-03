package edu.exam.ocp.se6.pe.pe1.q59;

import java.util.ArrayList;

/**
 * ArrayList.removeRange() is a protected method.
 * It can be accessed by MyUtil because MyUtil inherits ArrayList.
 */

public class MyUtil extends ArrayList {
    public static void main(String[] args) {
        MyUtil m = new MyUtil();
        m.add("w");
        m.add("x");
        m.add("y");
        m.add("z");
        m.removeRange(1, 3);
        System.out.print(m.size() + " ");
        MyUtil m2 = new MyUtil2().go();
        System.out.println(m2.size());
    }
}