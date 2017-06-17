package edu.exam.ocp.se6.sg.chapter3.switchcase;

public class StringValidAfterJava7 {
    public static void main(String[] args) {
        String myConsole = "WII";
        final String ps ="PLAYSTATION";
        switch (myConsole) {
            case "XBOX":
                System.out.println("XBox console");
                break;
            case "WII":
                System.out.println("WII console");
                break;
            case ps:
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