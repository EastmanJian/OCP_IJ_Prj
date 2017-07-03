package edu.exam.ocp.se6.sg.chapter7.generic.wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jiany on 2017-5-15.
 */
public class UpperBoundWildcards {
    public static void main(String[] args) {
        //ArrayList<Number> notvalid = new ArrayList<Double> (); //doesn't compile
        ArrayList<? extends Number> list2 = new ArrayList<Double>();
        ArrayList<? extends Number> list3 = new ArrayList<Integer>();
        List<? extends Number> list4 = new Stack<Float>();
    }
}
