package edu.exam.ocp.se6.sg.chapter3.continueloop;

public class ContinueAX {
    public static void main(String[] args) {
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue;
                System.out.print(" " + a + x);
            }
        }
    }
}

/* ->
 1a 1c 3a 3c 4a 4c
*/
