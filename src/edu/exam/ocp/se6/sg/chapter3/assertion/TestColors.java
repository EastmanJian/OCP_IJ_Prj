package edu.exam.ocp.se6.sg.chapter3.assertion;

/**
 * assertion example.
 * run with -ea
 * The only way this assertion would fail is if somehow the enum is modified. e.g. It's change to
 *     public enum Colors {
 *         RED, GREEN, BLUE, YELLOW.
 *     }
 * The assertion can help uncover the ripple effect of such a change.
 * A control flow assertion is a common use of assert statements. When possible, place an assert statement at any
 * location in your code that you assume will not be reached.
 */
public class TestColors {
    public enum Colors {
        RED, GREEN, BLUE, YELLOW //YELLOW is added latter
    }

    public static void testColor(Colors c) {
        switch (c) {
            case RED:
            case GREEN:
                System.out.println("Red or green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            default:
                assert false : "Invalid color";
        }
    }

    public static void main(String[] args) {
        testColor(Colors.YELLOW);
    }
}