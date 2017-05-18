package edu.exam.ocp.se6.pe.sat2.q01;

import java.util.*;
public class VLA2 implements Comparator<VLA2> {
    int dishSize;
    public static void main(String[] args) {
        VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
        for (VLA2 v : va) System.out.println(v.dishSize);
        Arrays.sort(va, va[0]);
        for (VLA2 v : va) System.out.println(v.dishSize);
        int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
        System.out.print(index + " ");
        index = Arrays.binarySearch(va, new VLA2(80), va[0]);
        System.out.print(index);
    }
    public int compare(VLA2 a, VLA2 b) {
        return b.dishSize - a.dishSize;
    }
    VLA2(int d) { dishSize = d; }
}

/*
API Arrays.binarySearch(...)
Returns:
index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1). The insertion point is defined as the point at which the key would be inserted into the array.

 */