package edu.exam.ocp.se6.pe.pe4.q04;

import java.util.*;

public class VC {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();
        Integer[] a = {3, 1, 4, 1};
        x = Arrays.asList(a);
        a[3] = 2;
        x.set(0, 7);
        for (Integer i : x) System.out.print(i + " ");
        x.add(9);
        System.out.println(x);
    }
}

/* ->
7 1 4 2 ...UnsupportedOperationException...
*/
