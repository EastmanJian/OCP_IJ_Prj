package edu.exam.ocp.se6.sg.chapter7.generic.wildcast;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UpperBoundWildcardsTest {
    public static void main(String[] args) {
        ArrayList<? extends Number> list = new ArrayList<>();
        Number n1 = new Integer(12);
        Integer n2 = new Integer (23);
        Double n3= new Double (34.56);
        //list.add(n1); //Compile error
        //list.add(n2); //Compile error
        //list.add(n3); //Compile error
        list.add(null);
    }

    public void testAdd(ArrayList<? extends Number> list){
        //list.add(new Integer(67));
        //list.add(new Double(78.9));
        for (Number n : list ) {
            System.out.println(n);
        }
    }
}

/* Working wih Java's polymorphism feature, a Number reference can refer to its child object like a Double or an Integer object.
 * But there will be compile error in line 16,17,18 because list's member can be <? extends Number>, like Number, Double, Integer etc..
 * for line 16, it tries to add a Number object to list, in case list is referencing to ArrayList<Integer>, it will cause problem because an Integer ref cannot refer to a Number object.
 * for line 17, it tries to add an Integer object to list, in case list is referencing to ArrayList<Double> or other type which is out of ArrayList<Integer>, it will cause error because Double ref or other parallel ref cannot refer to an Integer object.
 * In order to protect the consistency, Java compiler cannot let them pass.
 * the reason of compile error in line 18 is similar to line 17.
 * Only null is acceptable.
 * Though the list cannot be used for add, it can be used for get(), or in a method for traversing.
 * ref: http://blog.csdn.net/baple/article/details/25056169
 */
