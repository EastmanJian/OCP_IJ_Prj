package edu.exam.ocp.se6.sg.chapter3.forloop;

/**
 * Created by jiany on 2017-6-9.
 */
public class OptionalStatements {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; ) {
            System.out.print(i++ + ",");
        }

        for( ; ; ) {
            System.out.print("Hi");
        }
    }
}
