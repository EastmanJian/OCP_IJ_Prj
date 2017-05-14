package edu.exam.ocp.se6.pe.sat1.q06;

public class EqualsMethod {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));//（1）flase
        System.out.println(v1 == v2);//（2）true
    }
}