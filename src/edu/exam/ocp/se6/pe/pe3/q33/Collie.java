package edu.exam.ocp.se6.pe.pe3.q33;

import java.util.ArrayList;
import java.util.List;

public class Collie extends Dog {
    public static void main(String[] args) {
        List<Dog> d = new ArrayList<Dog>();
        List<Collie> c = new ArrayList<Collie>();
        d.add(new Collie());
        c.add(new Collie());
        do1(d); do1(c);
        do2(d); do2(c);
    }
    static void do1(List<? extends Dog> d2) {
//        d2.add(new Collie()); //Compile Error: no suitable method found for add(Collie)
                              //   method java.util.Collection.add(capture#2 of ? extends Dog) is not applicable
                              //           (argument mismatch; Collie cannot be converted to capture#2 of ? extends Dog)
                              //   method java.util.List.add(capture#2 of ? extends Dog) is not applicable
                              //           (argument mismatch; Collie cannot be converted to capture#2 of ? extends Dog)
        System.out.print(d2.size());
    }
    static void do2(List<? extends Canine> c2) { }
}