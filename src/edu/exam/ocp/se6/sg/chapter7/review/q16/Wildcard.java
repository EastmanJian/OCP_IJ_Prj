package edu.exam.ocp.se6.sg.chapter7.review.q16;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();
//        Stack<?> list = new Stack<?>(); //Compile Error. Wildcard type '?' cannot be instantiated directly.
        List<?> list = new ArrayList<String>();
        card.showSize(list);
    }
}