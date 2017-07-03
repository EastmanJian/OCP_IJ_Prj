package edu.exam.ocp.se6.sg.chapter7.review.q13;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(10); //initial capacity is 10.
        for (int i = 1; i <= 10; i++) {
            map.put(i, i * i);
        }
        System.out.println(map.get(4)); // -> 16
    }
}
