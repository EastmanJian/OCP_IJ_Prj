package edu.exam.ocp.se6.sg.chapter3.continueloop;

public class LabelContinue {
    public static void main(String[] args) {
        char row = 'A';
        rowlabel : while(row <= 'D') {
            System.out.print(row++);
            for(int i = 1; i <= 5; i++) {
                if(i%2 == 0)
                    continue;
                if(i%3 == 0) {
                    System.out.println();
                    continue rowlabel;
                }
                System.out.print(i);
            }
        }
    }
}

/* ->
A1
B1
C1
D1
*/