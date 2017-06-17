package edu.exam.ocp.se6.pe.pe1.q08;

public class Cool extends SuperCool {
    public static void main(String[] args) {
        new Cool().go();
    }

    void go() {
        SuperCool s = new Cool();
        Cool c = (Cool) s;

        c.doStuff();
        s.doStuff();
        this.doStuff();
        super.doStuff();
//        c.super.doStuff(); //compile error
//        s.super.doStuff(); //compile error
//        this.super.doStuff(); //compile error
//        super.this.doStuff(); //compile error

        Cool.super.doStuff();

    }

    void doStuff() {
        System.out.println("cool");
        os += "cool ";
    }
}

/* ->
cool
cool
cool
super cool
super cool
*/