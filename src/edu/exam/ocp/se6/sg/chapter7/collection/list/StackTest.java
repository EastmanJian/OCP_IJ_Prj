package edu.exam.ocp.se6.sg.chapter7.collection.list;

import java.util.Stack;

/**
 * Example of Stack
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        mystack.push(new Integer(100));
        mystack.push(200);
//        mystack.push("Not an Integer"); //Compile Error: incompatible types: java.lang.String cannot be converted to java.lang.Integer
        Integer top = mystack.pop();
        for(Integer i : mystack) {
            System.out.println(i);
        }
    }
}

/* ->
100
*/