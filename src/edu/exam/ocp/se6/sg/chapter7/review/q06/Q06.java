package edu.exam.ocp.se6.sg.chapter7.review.q06;

import java.util.Iterator;
import java.util.Stack;

public class Q06 {
    public static void main(String[] args) {
        Stack<String> greetings = new Stack<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        Iterator iter = greetings.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
/* ->
hello hi
*/
