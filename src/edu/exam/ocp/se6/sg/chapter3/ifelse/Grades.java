package edu.exam.ocp.se6.sg.chapter3.ifelse;

public class Grades {
    public static void showGrade(int grade) {
        if (grade >= 90) {
            System.out.print("A");
        } else if (grade >= 80) {
            System.out.print("B");
        } else if (grade >= 70) {
            System.out.print("C");
        } else if (grade >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
        System.out.println(" is your grade");
    }

    public static void main(String[] args) {
        showGrade(77);
        showGrade(54);
    }
}

/* ->
C is your grade
F is your grade
*/