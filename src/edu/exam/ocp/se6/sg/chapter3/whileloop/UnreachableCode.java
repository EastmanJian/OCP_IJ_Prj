package edu.exam.ocp.se6.sg.chapter3.whileloop;

public class UnreachableCode {
    public static void main(String[] args) {
        int x = 0;
        while(x > 0) {
            System.out.println("Not here");
        }

/*
        while(false) {
            System.out.println("Not here."); //Compile Error: unreachable statement
        }
*/

        boolean b = true;
        while(b = false) {
            System.out.println("Not here.");
        }

        if(false) {
            System.out.println("Unreachable");
        }
    }
}
