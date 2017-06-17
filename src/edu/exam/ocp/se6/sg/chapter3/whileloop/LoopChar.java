package edu.exam.ocp.se6.sg.chapter3.whileloop;

public class LoopChar {
    public static void main(String[] args) {
        char c = 'A';
        while(c <= 'H') {
            System.out.print(c++);
        }
    }
}

/* ->
ABCDEFGH
*/