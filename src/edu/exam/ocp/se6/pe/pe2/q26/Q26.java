package edu.exam.ocp.se6.pe.pe2.q26;

public class Q26 {
    public static void main(String[] args) {
        Integer[][] la = {{1, 2}, {3, 4, 5}};
        Number[] na = la[1];
        Number[] na2 = (Number[]) la[0]; //cast upper
        Object o = na2;
//        la[1] = (Number[])o; //compile fail
        la[0] = (Integer[])o; //cast down
    }
}
