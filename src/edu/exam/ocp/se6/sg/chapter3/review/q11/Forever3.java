package edu.exam.ocp.se6.sg.chapter3.review.q11;

public class Forever3 {
    public void run() {
        boolean b = true;
        while(b=true) {
            System.out.println("Hello");
        }
        System.out.println("Goodbye");//compiles fine.
    }
}