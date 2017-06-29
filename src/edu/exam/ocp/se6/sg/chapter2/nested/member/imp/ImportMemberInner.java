package edu.exam.ocp.se6.sg.chapter2.nested.member.imp;

import edu.exam.ocp.se6.sg.chapter2.nested.member.A;
//import edu.exam.ocp.se6.sg.chapter2.nested.member.A.B; //not required.

public class ImportMemberInner {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.go();

    }
}
