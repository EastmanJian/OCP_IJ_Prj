package edu.exam.ocp.se6.sg.chapter2.enumeration;

/**
 * Example of enum constructor
 */
public class IceCreamTest {
    public static void main(String[] args) {
        IceCream cone1 = IceCream.PLAIN;
        IceCream cone2 = IceCream.WAFFLE;
        System.out.println(cone1 + " needs " + cone1.scoops + " scoops.");
        System.out.println(cone2 + " needs " + cone2.scoops + " scoops.");
    }
}

/* ->
PLAIN needs 2 scoops.
WAFFLE needs 5 scoops.
*/