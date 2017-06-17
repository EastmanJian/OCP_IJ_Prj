package edu.exam.ocp.se6.sg.chapter3.forloop;

/**
 * The Scope of for Loop Variables
 */
public class VarScope {
    public static void main(String[] args) {
        for(int k = 10; k >= 1; k--) {
            System.out.print(k);
        }
//        System.out.print(k); //Compile Error: Cannot find symbol

    }
}
