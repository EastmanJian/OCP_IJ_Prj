package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Example of ClassCastException
 */
public class ClassCastE {
    public static void main(String[] args) {
//        Integer x = new Integer(10);
//        String y = (String) x; //compile error: incompatible types: java.lang.Integer cannot be converted to java.lang.String

//        Object o = new Integer(10);
//        String s = (String) o; //runtime exception: java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

        /**
         * using instanceof to avoid ClassCastException
         */
        Object o = new Integer(10);
        if(o instanceof String) {
            String s = (String) o;
        }

    }
}
