package edu.exam.ocp.se6.pe.sat2.q07;

public class Go extends Game {
//    Go() { super(s2); }  //compile error: cannot reference s2 before supertype constructor has been called
    { s += "i "; }
    public static void main(String[] args) {
        new Go();
        System.out.println(s);
    }
    Go() {
        super("cc ");
        s += s2; //you can refer to s2 after super constructor is invoked.
    }
    static { s += "sb "; }
    public void aMethod() { s2 = "anything"; } //valid
}

/* ->
-sb cc s2 YYS i s2
*/