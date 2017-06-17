package edu.exam.ocp.se6.sg.chapter3.forloop;

/**
 * The Scope of for Loop Variables
 */
public class VarScopeOK {
    public static void main(String[] args) {
        int k = 10;
        for(k = 10; k >= 1; k--) {
            System.out.print(k);
        }
        System.out.print(k);
    }
}
