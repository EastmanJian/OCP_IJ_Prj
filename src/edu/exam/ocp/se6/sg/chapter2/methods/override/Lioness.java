package edu.exam.ocp.se6.sg.chapter2.methods.override;

public class Lioness extends Mammal {
    public int eat(String something) {
        System.out.println("Inside Lion");
        return super.eat(something);
    }
    public static void main(String[] args) {
        Lioness lioness = new Lioness();
        lioness.eat("zebra");
    }
}

/* ->
Inside Lion
Inside Mammal
*/