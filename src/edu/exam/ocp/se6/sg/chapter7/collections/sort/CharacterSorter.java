package edu.exam.ocp.se6.sg.chapter7.collections.sort;

/**
 * Example of Comparable sorting for Character
 *
 * Run with parameter:
 * java CharacterSorter soRTedChAractERs
 *
 * Character objects are naturally ordered by their numeric Unicode values (which is not alphabetical because all
 * uppercase letters appear before all lowercase letters).
 */

import java.util.*;

public class CharacterSorter {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        List<Character> list = new ArrayList<Character>(); //Character implements Comparable interface
        for (char c : chars) {
            list.add(c);
        }
        Collections.sort(list);
        for (Character c : list) {
            System.out.print(c + " ");
        }
    }
}

/* ->
A C E R R T a c d e h o r s s t
*/