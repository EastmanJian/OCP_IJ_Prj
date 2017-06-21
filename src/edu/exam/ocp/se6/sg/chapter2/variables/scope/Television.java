package edu.exam.ocp.se6.sg.chapter2.variables.scope;

public class Television {
    public int channel;
    public double diagonal;
    public String brand;

    public Television() {
        channel = 4;
    }

    public static void main(String[] args) {
        Television tv = new Television();
        System.out.println(tv.channel + " " + tv.diagonal + " " + tv.brand); // -> 4 0.0 null
    }
}