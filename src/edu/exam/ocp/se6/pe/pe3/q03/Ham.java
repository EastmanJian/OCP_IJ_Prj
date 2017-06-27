package edu.exam.ocp.se6.pe.pe3.q03;

import java.util.ArrayList;
import java.util.List;

class Ham extends Radio {
    String getFreq() { return "50.1"; }
    static String getF() { return "50.1"; }

    public static void main(String[] args) {
        List<Radio> radios = new ArrayList<Radio>();
        radios.add(new Radio());
        radios.add(new Ham()); //add Radio's child object to List<Radio> is valid
        for (Radio r : radios)
            System.out.print(r.getFreq() + " " + r.getF() + " ");
    }
}