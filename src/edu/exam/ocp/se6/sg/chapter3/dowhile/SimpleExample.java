package edu.exam.ocp.se6.sg.chapter3.dowhile;

public class SimpleExample {
    public static void main(String[] args) {
        int y = 1;
        do {
            System.out.print(y++ + " ");
        } while (y <= 10);
    }
}

/* ->
1 2 3 4 5 6 7 8 9 10
*/