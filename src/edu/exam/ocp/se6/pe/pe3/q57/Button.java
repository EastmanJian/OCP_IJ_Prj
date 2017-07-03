package edu.exam.ocp.se6.pe.pe3.q57;

public class Button extends GuiThing {
    void doStuff() { System.out.print("button "); }

    public static void main(String[] args) {
        new Button().go();
    }

    void go() {
        GuiThing g = new GuiThing();
        this.doStuff(); // -> button
        super.doStuff(); // -> gui
        Button.super.doStuff();  // -> gui
        Button.this.doStuff(); // -> button
//        GuiThing.this.doStuff(); //compile error
//        this.super.doStuff(); //compile error
//        g.super.doStuff();  //compile error
//        super.this.doStuff(); //compile error
//        super.super.doStuff();  //compile error
    }
}