package edu.exam.ocp.se6.sg.chapter3.switchcase;

public class EnumSwitchInvalid {
    public enum Console {
        XBOX, WII, PLAYSTATION
    }

    public static void main(String[] args) {
        Console yourConsole = Console.XBOX;
//        switch (yourConsole) {
//            case 0: //Compile Error: an enum switch case label must be the unqualified name of an enumeration constant
//                System.out.println("XBox console");
//                break;
//            case Console.WII: //Compile Error: an enum switch case label must be the unqualified name of an enumeration constant
//                System.out.println("WII console");
//                break;
//        }
    }
}
