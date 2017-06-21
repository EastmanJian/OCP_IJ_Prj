package edu.exam.ocp.se6.sg.chapter2.methods.variablelengtharguments;

import static java.lang.System.out;

/**
 * Variable-length arguments can sometimes lead to ambiguities in method overloading.
 */
public class Ambiguous {
    public static short average(short... values){
        short sum = 0;
        for (short v : values) {
            sum += v;
        }
        return values.length == 0 ? 0 : (short) (sum / values.length);
    }

    public static int average(int... values){
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return values.length == 0 ? 0 : sum / values.length;
    }

    public static double average(double... values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return values.length == 0 ? 0 : sum / values.length;
    }

    public static void main(String[] args) {
        out.println(average(12.5, -4.78, 39.04)); //works fine
        out.println(average(6, 10, 14, 20)); //works fine, but in java 5.0, this might not compile.
        out.println(average()); //works fine, but in java 5.0, this might not compile.
    }

}
