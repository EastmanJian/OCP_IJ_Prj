package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

/**
 * super() vs super variable
 */
public class Endora extends Woman {
    public Endora(String s) {
        super("Endora");
        super.walk(); //this 'super' keyword is variable that represents the reference to an object's parent. Compiles fine.
        System.out.println("Hello " + s);
    }

    public static void main(String[] args) throws Throwable {
        Endora e = new Endora("mum");
        e.finalize();
    }
}

/* ->
Build Endora
walking.
Hello mum
*/
