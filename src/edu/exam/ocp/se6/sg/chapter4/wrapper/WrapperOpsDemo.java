package edu.exam.ocp.se6.sg.chapter4.wrapper;

public class WrapperOpsDemo {
    public static void main(String[] args) {
        Integer i = new Integer(30);
        Integer j = new Integer(33);
        i = j % i;
        i--;
        System.out.println("i=" + i); // -> i=2
    }
}
