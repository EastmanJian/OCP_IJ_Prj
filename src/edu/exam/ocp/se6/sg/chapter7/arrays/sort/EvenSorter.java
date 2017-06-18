package edu.exam.ocp.se6.sg.chapter7.arrays.sort;


/**
 * even numbers are greater than odd numbers
 */
public class EvenSorter implements java.util.Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return (b % 2) - (a % 2);
    }
}