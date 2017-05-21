package edu.exam.ocp.se6.sg.chapter6.encapsulation;

/**
 * Bad example of encapsulation
 */
public class Student1 {
    public String year;
    public double grade;

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.year = "Memphis, TN";  //The string “ Memphis, TN ” is not a valid year,
        s.grade = -24.5;  //a student’s grade should never be negative. With tight encapsulation, these issues can easily be avoided
    }
}