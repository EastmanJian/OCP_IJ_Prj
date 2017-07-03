package edu.exam.ocp.se6.sg.chapter3.review.q05;

public class Q05 {
    public static void main(String[] args) {
        final char a = 'A';
        final Character d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("passed");
                break;
//            case d: //compile error: case constant cannot be an reference
            case 'F':
                System.out.print("not good");
        }
    }
}
