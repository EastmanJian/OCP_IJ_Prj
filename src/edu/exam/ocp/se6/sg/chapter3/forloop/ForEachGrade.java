package edu.exam.ocp.se6.sg.chapter3.forloop;

public class ForEachGrade {
    public static void main(String[] args) {
        char [] grades = {'A', 'B', 'C', 'D', 'F'};
        for(char grade : grades) {
            System.out.print(grade + " ");
        }        
    }
}

/* ->
A B C D F
*/