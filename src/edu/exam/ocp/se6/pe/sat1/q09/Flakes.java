package edu.exam.ocp.se6.pe.sat1.q09;

import java.util.ArrayList;
import java.util.List;

public class Flakes extends Cereal {
    public static void main(String[] args) {
        //List<Flakes> c0 = new List<Flakes>();  //Compile Error： java.util.List is abstract; cannot be instantiated
        List<Cereal> c1 = new ArrayList<Cereal>();

        Cereal co2 = new Flakes();
        //List<Cereal> c2 = new ArrayList<Flakes>(); //Compile Error: incompatible types: java.util.ArrayList<Flakes> cannot be converted to java.util.List<Cereal>

        //Flakes co3 = new Cereal();  //Compile Error: incompatible types: Cereal cannot be converted to Flakes
        //List<Flakes> c3 = new ArrayList<Cereal>();  //Compile Error: incompatible types: java.util.ArrayList<Cereal> cannot be converted to java.util.List<Flakes>
        //List<Object> c4 = new ArrayList<Flakes>(); //Compile Error: incompatible types: java.util.ArrayList<Flakes> cannot be converted to java.util.List<java.lang.Object>
        //ArrayList<Cereal> c5 = new ArrayList<Flakes>(); //Compile Error: incompatible types: java.util.ArrayList<Flakes> cannot be converted to java.util.List<Cereal>
    }
}