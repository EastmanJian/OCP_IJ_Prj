package edu.exam.ocp.se6.sg.chapter3.review.q11;

public class Forever2 {
    public void run() {
        for (int i=0; i<5;) {
            System.out.println("Hello");
        }
        System.out.println("Goodbye");//compiles fine.
    }
}