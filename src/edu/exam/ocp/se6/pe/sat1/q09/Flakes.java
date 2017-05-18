package edu.exam.ocp.se6.pe.sat1.q09;

import java.util.ArrayList;
import java.util.List;

public class Flakes extends Cereal {
    public static void main(String[] args) {
//        List<Flakes> c0 = new List<Flakes>();
        List<Cereal> c1 = new ArrayList<Cereal>();
        Cereal co2 = new Flakes();
//        List<Cereal> c2 = new ArrayList<Flakes>();
//        Flakes co3 = new Cereal();
//        List<Flakes> c3 = new ArrayList<Cereal>();
//        List<Object> c4 = new ArrayList<Flakes>();
//        ArrayList<Cereal> c5 = new ArrayList<Flakes>();
        ArrayList<? extends Cereal> c6 = new ArrayList<Flakes>();
        List<? extends Cereal> c7 = new ArrayList<Flakes>();
    }
}

/*
Line 8:  Compile Error： java.util.List is abstract; cannot be instantiated
Line 11: Compile Error: incompatible types: java.util.ArrayList<Flakes> cannot be converted to java.util.List<Cereal>
Line 12: Compile Error: incompatible types: Cereal cannot be converted to Flakes
Line 13: Compile Error: incompatible types: java.util.ArrayList<Cereal> cannot be converted to java.util.List<Flakes>
Line 14: Compile Error: incompatible types: java.util.ArrayList<Flakes> cannot be converted to java.util.List<java.lang.Object>
Line 15: Compile Error: incompatible types: java.util.ArrayList<Flakes> cannot be converted to java.util.List<Cereal>
 */