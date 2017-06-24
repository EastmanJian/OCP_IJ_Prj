package edu.exam.ocp.se6.sg.chapter7.collection.set;

/**
 * Example for TreeSet elements
 * (this is out of SG book)
 */
public class ItemComparable implements Comparable<ItemComparable> {
    private int id;

    public ItemComparable(int id) {
        this.id = id;
    }

    public String toString() {
        return id + "";
    }

    public int compareTo(ItemComparable ic) {
        return this.id - ic.id;
    }

}
