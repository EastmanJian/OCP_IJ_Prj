package edu.exam.ocp.se6.sg.chapter3.forloop;

/**
 * nested for
 */
public class NestedFor {
    public static void main(String[] args) {
        for (char one = 'a'; one <= 'f'; one++) {
            for (int i = 1; i <= 3; i++) {
                System.out.print(" " + one + i);
            }
            System.out.println();
        }
    }
}

/* ->
 a1 a2 a3
 b1 b2 b3
 c1 c2 c3
 d1 d2 d3
 e1 e2 e3
 f1 f2 f3
*/
