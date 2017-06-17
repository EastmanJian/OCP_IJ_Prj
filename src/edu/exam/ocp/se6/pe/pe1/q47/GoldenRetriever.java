package edu.exam.ocp.se6.pe.pe1.q47;

/**
 *  'super' is an instance variable, so it CANNOT be used from a static context.
 */
class GoldenRetriever extends Dog {
    void makeNoise() {
        System.out.print("howl ");
    }

    static void play() {
//        super.play(); //Compile Error: non-static variable super cannot be referenced from a static context
        System.out.print("crawl ");
    }

    public static void main(String[] args) {
        new GoldenRetriever().go();
//        makeNoise();//Compile Error:non-static method makeNoise() cannot be referenced from a static context
    }

    void go() {
        super.play();
        makeNoise();
        play();
        super.makeNoise();
    }
}