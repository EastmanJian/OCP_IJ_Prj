package edu.exam.ocp.se6.sg.chapter4.autoboxing;

/**
 * Example of using == to compare wrapped types
 */
public class AutoboxingTest {
    public static void main(String[] args) {
        Integer one = new Integer(128);
        Integer two = new Integer(128);
        if (one == two)  // they are not unboxed
            System.out.println("true");
        else
            System.out.println("false");
        int three = 128;
        if (one == three)  //one is auto unboxed
            System.out.println("true");
        else
            System.out.println("false");
    }
}

/* ->
false
true
*/