package edu.exam.ocp.se6.sg.chapter2.methods.overload;

/**
 * Example of smallest promotion in overloading methods
 */
public class SmallestPromotion {
    public static void main(String[] args) {
        byte b = -41;
        SmallestPromotion sp = new SmallestPromotion();
        System.out.println(sp.convert(b)); //b is converted to short as parameter
    }


    public String convert(int x) {
        return "int";
    }

    public String convert(short b) {
        return "short";
    }
}

/* ->
short
 */