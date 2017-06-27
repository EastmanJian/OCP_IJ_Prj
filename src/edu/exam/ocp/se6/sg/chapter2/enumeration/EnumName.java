package edu.exam.ocp.se6.sg.chapter2.enumeration;

/**
 * Using enum name() method
 * (out of SG Book)
 */
public class EnumName {
    public enum Suit {
        Club, Diamond, Heart, Spade
    }

    public static void main(String[] args) {
        Suit myCardsSuit = Suit.Diamond;
        String myCardsSuitString = myCardsSuit.name();
        System.out.println(myCardsSuitString); // -> Diamond
    }
}
