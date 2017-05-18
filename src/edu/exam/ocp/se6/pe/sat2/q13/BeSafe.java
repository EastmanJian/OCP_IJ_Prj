package edu.exam.ocp.se6.pe.sat2.q13;

public class BeSafe {
    public static void main(String[] args) {
//        SafeDeposit sd = new SafeDeposit(); //compile error
        SafeDeposit sd1 = SafeDeposit.getInstance(30); //this one is correct
//        SafeDeposit sd2 = new SafeDeposit(30); //compile error
        System.out.println("code=" + sd1.getCode());
    }
}

/*
Compile output:
Error:(5, 26) java: constructor SafeDeposit in class edu.exam.ocp.se6.pe.sat2.q13.SafeDeposit cannot be applied to given types;
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Error:(7, 27) java: SafeDeposit(int) has private access in edu.exam.ocp.se6.pe.sat2.q13.SafeDeposit

*/