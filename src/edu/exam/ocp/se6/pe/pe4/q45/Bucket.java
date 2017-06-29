package edu.exam.ocp.se6.pe.pe4.q45;

import java.util.*;

public class Bucket {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        Set<String> lh = new LinkedHashSet<String>();
        Set<String> ts = new TreeSet<String>();
        List<String> al = new ArrayList<String>();
        String[] v = {"1", "3", "1", "2"};
        for (int i = 0; i < v.length; i++) {
            hs.add(v[i]);
            lh.add(v[i]);
            ts.add(v[i]);
            al.add(v[i]);
        }
        Iterator it = hs.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
        Iterator it2 = lh.iterator();
        while (it2.hasNext()) System.out.print(it2.next() + " ");
        System.out.println();
        Iterator it3 = ts.iterator();
        while (it3.hasNext()) System.out.print(it3.next() + " ");
        System.out.println();
        Iterator it5 = al.iterator();
        while (it5.hasNext()) System.out.print(it5.next() + " ");
        System.out.println();
    }
}