package edu.exam.ocp.se6.sg.chapter7.collection.comparable;

/**
 * You are strongly encouraged to make your Comparable classes consistent with equals because not all collection
 * classes behave predictably if the compareTo and equals methods are not consistent.
 */
public class Product implements Comparable<Product> {
    int id;

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {
        return this.id - obj.id;
    }
}