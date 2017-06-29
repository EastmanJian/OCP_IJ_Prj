package edu.exam.ocp.se6.pe.pe4.q08;

public class Hummingbird extends Bird {
    public static void fly() { s += "hover "; }  //method hiding
    public void chirp() { s += "jiji "; }  //method overriding

    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Hummingbird();
        Bird b3 = (Hummingbird) b2;
        Hummingbird b4 = (Hummingbird) b2;
        b1.fly(); b1.chirp();
        b2.fly(); b2.chirp();
        b3.fly(); b3.chirp();
        b4.fly(); b4.chirp();
        System.out.println(s); // -> fly shirp fly jiji fly jiji hover jiji

        s = "";
        b4.go();
        System.out.println(s); // -> fly shirp hover jiji hover jiji
    }

    public void go() {
        super.fly(); super.chirp();
        this.fly(); this.chirp();
        fly(); chirp();
    }
}