package edu.exam.ocp.se6.sg.chapter3.breakloop;

/**
 * Created by jiany on 2017-6-9.
 */
public class BreakK {
    public static void main(String[] args) {
        for(int k = 1; k < 10; k++) {
            System.out.print(k + " ");
            if(k % 3 == 0)
                break;
        }
    }
}

/* ->
1 2 3
*/