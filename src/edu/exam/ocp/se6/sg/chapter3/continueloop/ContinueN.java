package edu.exam.ocp.se6.sg.chapter3.continueloop;

public class ContinueN {
    public static void main(String[] args) {
        for(char c = 'm'; c <= 'p'; c++) {
            if(c == 'n') {
                continue;
            }
            System.out.print(c);
        }
    }
}

/* ->
mop
*/
