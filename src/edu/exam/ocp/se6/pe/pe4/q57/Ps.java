package edu.exam.ocp.se6.pe.pe4.q57;

import java.util.*;

public class Ps {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("4");
        pq.add("7");
        pq.add("2");

        Iterator it2 = pq.iterator();
        while (it2.hasNext()) System.out.print(it2.next() + "-");
        System.out.println(); // using iterator, the queue is not ordered: -> 2-7-4-

        Object[] pqa = pq.toArray();
        Arrays.sort(pqa);
        for(Object o: pqa) System.out.print(o + "-"); // -> 2-4-7-
        System.out.println();

        String s = pq.poll();
        while (s != null) {
            System.out.print(s + "-");
            s = pq.poll();
        } // using poll, the elements are removed in order: -> 2-4-7-
    }
}