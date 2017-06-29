package edu.exam.ocp.se6.pe.pe4.q20;

public class TimeMachine implements Gadget {
    int patent = 34567;

    public static void main(String[] args) {
        new TimeMachine().doStuff();
    }

    public TimeMachine doStuff() {
        System.out.println(++patent);
        return new TimeMachine();
    }
}