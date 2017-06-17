package edu.exam.ocp.se6.sg.chapter7.collection.equals;

/**
 * Sets do not allow duplicate elements and maps do not allow duplicate keys. The set and map classes use the equals
 * method of the objects in the collection to determine if two objects are equal.
 * If you are using collections, you should include an equals method in your classes.
 * When overriding equals, be sure to override hashCode so that two equal objects generate the same hashCode.
 *
 * In below Product example, two Product objects are equal if they have the same id, and two equal Product objects
 * generate the same hashCode.
 */
public class Product {
    String description;
    double price;
    int id;

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.id == other.id;
    }

    public int hashCode() {
        return id;
    }
}
