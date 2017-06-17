package edu.exam.ocp.se6.sg.chapter7.collection.map;

import java.util.*;

/**
 * Example of methods in NavigableMap interface using TreeMap
 */
public class NavigableMapTest {
    public static void main(String[] args) {
        TreeMap<Character, Integer> ascii = new TreeMap<Character, Integer>();
        int value = 97;
        for (char c = 'a'; c <= 'z'; c++) {
            ascii.put(c, value++);
        }
        Map.Entry<Character, Integer> ceiling = ascii.ceilingEntry('h');
        System.out.println("ceiling: " + ceiling);
        SortedMap<Character, Integer> tailMap = ascii.tailMap('t');
        Set<Character> tailKeys = tailMap.keySet();
        for (Character key : tailKeys) {
            System.out.print(key + " ");
        }
        System.out.println();
        NavigableSet<Character> keys = ascii.descendingKeySet();
        for(Character key : keys) {
            System.out.print(key + " ");
        }
    }
}

/* ->
ceiling: h=104
t u v w x y z
z y x w v u t s r q p o n m l k j i h g f e d c b a
*/