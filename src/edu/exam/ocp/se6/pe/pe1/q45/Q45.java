package edu.exam.ocp.se6.pe.pe1.q45;

public class Q45 {
    public static void main(String[] args) {
        String s = "1234";
        StringBuilder sb = new StringBuilder(s.substring(2).concat("56").replace("7", "6"));
        System.out.println(sb.append("89").insert(3, "x")); // -> 345x689
    }
}
