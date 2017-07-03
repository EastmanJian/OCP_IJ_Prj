package edu.exam.ocp.se6.sg.chapter3.review.q11;

public class Forever {
    public void run() {
        while(true) {
            System.out.println("Hello");
        }
//        System.out.println("Goodbye"); //compile error: unreachable statement
    }
}