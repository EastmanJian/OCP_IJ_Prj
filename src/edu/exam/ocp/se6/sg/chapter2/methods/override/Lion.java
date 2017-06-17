package edu.exam.ocp.se6.sg.chapter2.methods.override;

public class Lion extends Mammal {
    public int eat(String something) {
        System.out.println("Inside Lion");
        return something.length();
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Lion lion = new Lion();
        mammal.eat("food");
        lion.eat("warthog");
    }
}

/* ->
Inside Mammal
Inside Lion
*/