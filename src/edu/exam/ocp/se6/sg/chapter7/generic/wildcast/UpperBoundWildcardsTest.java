package edu.exam.ocp.se6.sg.chapter7.generic.wildcast;

import java.util.ArrayList;



public class UpperBoundWildcardsTest {
    public static void main(String[] args) {
        ArrayList<? extends Number> list = new ArrayList<>();
        Number n1 = new Integer(12);
        Integer n2 = new Integer (23);
        Double n3= new Double (34.56);
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
        list.add(null);
    }

    public void testAdd(ArrayList<? extends Number> list){
//        list.add(new Integer(67));
//        list.add(new Double(78.9));
        for (Number n : list ) {
            System.out.println(n);
        }
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(123);
        list = intList;
    }
}

/*
Line 13: Compile Error: no suitable method found for add(java.lang.Number).
    method java.util.ArrayList.add(capture#1 of ? extends java.lang.Number) is not applicable
    (argument mismatch; java.lang.Number cannot be converted to capture#1 of ? extends java.lang.Number)
Line 14: Compile Error: no suitable method found for add(java.lang.Integer)
    method java.util.ArrayList.add(capture#1 of ? extends java.lang.Number) is not applicable
    (argument mismatch; java.lang.Integer cannot be converted to capture#1 of ? extends java.lang.Number)
Line 15: Compile Error: no suitable method found for add(java.lang.Double)
    method java.util.ArrayList.add(capture#1 of ? extends java.lang.Number) is not applicable
    (argument mismatch; java.lang.Double cannot be converted to capture#1 of ? extends java.lang.Number)
Line 20: Compile Error: no suitable method found for add(java.lang.Integer)
    method java.util.ArrayList.add(capture#1 of ? extends java.lang.Number) is not applicable
    (argument mismatch; java.lang.Integer cannot be converted to capture#1 of ? extends java.lang.Number)
Line 21: Compile Error: no suitable method found for add(java.lang.Double)
    method java.util.ArrayList.add(capture#1 of ? extends java.lang.Number) is not applicable
    (argument mismatch; java.lang.Double cannot be converted to capture#1 of ? extends java.lang.Number)
*/


/* Working wih Java's polymorphism feature, a Number reference can refer to its child object like a Double or an Integer object.
 *
 * But there will be compile error in line 13,14,15 because list's member can be <? extends Number>, like Number, Double, Integer etc..
 * In line 13, it tries to add a Number object to list, in case list is referencing to ArrayList<Integer>, it will cause problem because an Integer ref cannot refer to a Number object.
 * In line 14, it tries to add an Integer object to list, in case list is referencing to ArrayList<Double> or other type which is out of ArrayList<Integer>, it will cause error because Double ref or other references cannot refer to an Integer object.
 * In order to protect the consistency, Java compiler cannot let them pass.
 * The reason of compile error in line 15 is similar to line 14.
 * Only null is acceptable to be added, see line 16.
 *
 * Similar to line 14 and 15, there will be the same compile err in line 20 and 21.
 *
 * Though the list cannot be used for add in most cases, it can be used for get(), or in a method for traversing, or assign another initiated List object to the list. Demonstrated in line 22~27
 * ref: http://blog.csdn.net/baple/article/details/25056169
 */
