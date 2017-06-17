package edu.exam.ocp.se6.pe.pe1.q47;

/**
 *  'super' is an instance variable, so it CANNOT be used from a static context.
 */
class Bloodhound extends Dog {
    void makeNoise() {
        System.out.print("howl ");
    }

    public static void main(String[] args) {
        new Bloodhound().go();
//        super.play(); //Compile Error: non-static variable super cannot be referenced from a static context
//        super.makeNoise(); //Compile Error: non-static variable super cannot be referenced from a static context
    }

    void go() {
        super.play(); //Compiles and runs fine
        makeNoise();
        super.makeNoise();
    }
}