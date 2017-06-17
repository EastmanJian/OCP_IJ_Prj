package edu.exam.ocp.se6.sg.chapter7.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 	HashMap and LinkedHashMap allows null as its elements (key or value).
 * 	But TreeMap, Hashtable do not allow null elements.
 * 	Adding null elements to HashTable or TreeMap will generates NullPointerException.
 */
public class MapNullElements {
    public static void main(String[] args) {
//        Map<String, int> m = new HashMap<>(); //Compile Error: unexpected type. required: reference found: int
        Map<String, Integer> hm = new HashMap<>();
        hm.put("TV", 305);
        hm.put(null, 0);
        hm.put("Fridge", 602);
        hm.put("Oven", null);
        for (String key : hm.keySet()) {
            System.out.println(key + " - " + hm.get(key));
        }
        System.out.println();

        Map<String, Integer> ht = new Hashtable<>();
        ht.put("TV", 305);
//        ht.put(null, 0); //NullPointerException at runtime
        ht.put("Fridge", 602);
//        ht.put("Oven", null); //NullPointerException at runtime
        for (String key : ht.keySet()) {
            System.out.println(key + " - " + ht.get(key));
        }
        System.out.println();

        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("TV", 305);
        lhm.put(null, 0);
        lhm.put("Fridge", 602);
        lhm.put("Oven", null);
        for (String key : lhm.keySet()) {
            System.out.println(key + " - " + lhm.get(key));
        }

    }
}

/* ->
null - 0
TV - 305
Oven - null
Fridge - 602

Fridge - 602
TV - 305

TV - 305
null - 0
Fridge - 602
Oven - null
*/