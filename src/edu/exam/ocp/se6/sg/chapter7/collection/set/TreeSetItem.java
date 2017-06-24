package edu.exam.ocp.se6.sg.chapter7.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet's elements are ordered when they are added into the set. The elements must implement Comparable interface.
 * Otherwise, there will be runtime error while adding elements to a TreeSet
 * (this is out of SG book)
 */
public class TreeSetItem {
    public static void main(String[] args) {
        Set<ItemComparable> s2 = new TreeSet<>();
        s2.add(new ItemComparable(3));
        s2.add(new ItemComparable(9));
        s2.add(new ItemComparable(6));
        for (ItemComparable i : s2) System.out.print(i); // -> 369

        Set<Item> s1 = new TreeSet<>();
        s1.add(new Item(3)); // -> Runtime Exception: ClassCastException: Item cannot be cast to Comparable
        s1.add(new Item(9));
        s1.add(new Item(6));
        for (Item i : s1) System.out.print(i);
    }
}