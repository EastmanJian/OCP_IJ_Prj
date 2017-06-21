package edu.exam.ocp.se6.sg.chapter4.string;

public class Concatenation {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder(26);
        for (char current = 'a'; current <= 'z'; current++) {
            alpha.append(current);
        }
        System.out.println(alpha); // -> abcdefghijklmnopqrstuvwxyz

    }
}
