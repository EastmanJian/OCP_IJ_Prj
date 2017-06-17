package edu.exam.ocp.se6.sg.chapter3.switchcase;

public class EnumSwitch {
    public enum Console {
        XBOX, WII, PLAYSTATION
    }

    public static void main(String[] args) {
        Console myConsole = Console.WII;
        switch (myConsole) {
            case XBOX:
                System.out.println("XBox console");
                break;
            case WII:
                System.out.println("WII console");
                break;
            case PLAYSTATION:
                System.out.println("PlayStation console");
                break;
            default:
                System.out.println("Not here");
        }
    }
}

/* ->
WII console
*/