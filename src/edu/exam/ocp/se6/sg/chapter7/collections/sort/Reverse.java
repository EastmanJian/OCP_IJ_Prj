package edu.exam.ocp.se6.sg.chapter7.collections.sort;

/**
 * Example of Comparator sorting
 */
public class Reverse implements java.util.Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
