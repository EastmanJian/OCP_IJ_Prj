package edu.exam.ocp.se6.sg.chapter3.review.q11;

public class Forever1 {
    public void run() {
        for (;;) {
            System.out.println("Hello");
        }
//        System.out.println("Goodbye");//compile error: unreachable statement
    }
}