package edu.exam.ocp.se6.sg.chapter2.enumeration;

public class EnumSwitchCase {

    private enum Seasons {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Seasons now = Seasons.WINTER;
        switch (now) {
            case WINTER:
                System.out.println("It is cold now");
                break;
            case SUMMER:
                System.out.println("It is hot now");
                break;
            default:
                System.out.println("It is nice now");
        }
    }
}

/* ->
It is cold now
*/