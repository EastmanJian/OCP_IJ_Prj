package edu.exam.ocp.se6.sg.chapter3.dowhile;

public class AtLeastOnce {
    public static void main(String[] args) {
        char c = 'a';
        do {
            System.out.println(c++);
        }while(false);
        System.out.println(c);
    }
}

/* ->
a
b
*/