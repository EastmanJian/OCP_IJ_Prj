package edu.exam.ocp.se6.sg.chapter3.forloop;

/**
 * not like basic for-loop, the iterator cannot be declared outside the for-each block
 */
public class ForEachGradeNG {
    public static void main(String[] args) {
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        char grade;
/*
        for (grade : grades) { //compile error
            System.out.print(grade + " ");
        }
*/
    }
}

