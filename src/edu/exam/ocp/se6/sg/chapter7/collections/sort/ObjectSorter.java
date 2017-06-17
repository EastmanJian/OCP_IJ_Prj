package edu.exam.ocp.se6.sg.chapter7.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * only List objects whose generic type implements Comparable can be an argument for the sort method.
 * Java generics enforce data type rules at compile time to avoid issues at runtime.
 */
public class ObjectSorter {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<Object>();
        items.add("Java");
        items.add(new Integer(123));
//        Collections.sort(items); //Compile Error
    }
}

/* ->
Compile Error:(15, 20) java: no suitable method found for sort(java.util.List<java.lang.Object>)
        method java.util.Collections.<T>sort(java.util.List<T>) is not applicable
        (inference variable T has incompatible bounds equality constraints: java.lang.Object upper bounds: java.lang.Comparable<? super T>)
*/