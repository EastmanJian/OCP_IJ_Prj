package edu.exam.ocp.se6.sg.chapter3.switchcase;

public class IntSwitch {
    public static void main(String[] args) {
        int x = 0;
        switch (x) {
            case 0:
            case 1:
                System.out.println("0 or 1");
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("2 or 3");
                break;
            default:
                System.out.println("default");
        }
        System.out.println("After switch");
    }
}

/* ->
0 or 1
After switch
*/