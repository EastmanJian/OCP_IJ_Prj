package edu.exam.ocp.se6.pe.sat2.q11;

public class Carpet<V extends B> {
    public <X extends V> Carpet<? extends V> method(Carpet<? super X> e) {
        return new Carpet<X>();
//        return new Carpet<V>(); //valid
    }

    public static void main(String[] args) {
        Carpet<B> carpetB = new Carpet<>();
        Carpet r= carpetB.<C>method(new Carpet<B>());
        System.out.println(r);
    }
}