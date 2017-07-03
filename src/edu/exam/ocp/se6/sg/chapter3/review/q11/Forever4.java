package edu.exam.ocp.se6.sg.chapter3.review.q11;

public class Forever4 {
    public void run() {
        while(true) {
            System.out.println("Hello");
        }
//        assert false : "unreachable"; //compile error: unreachable statement
    }
}