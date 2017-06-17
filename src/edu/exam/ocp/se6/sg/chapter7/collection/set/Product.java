package edu.exam.ocp.se6.sg.chapter7.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Example of HashSet
 */
public class Product {
    String description;
    double price;
    int id;

    public Product(String d, double p, int i) {
        description = d;
        price = p;
        id = i;
    }

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

    public String toString() {
        return id + " " + description;
    }

    public static void main(String[] args) {
        Product one = new Product("Laptop", 1299.99, 101);
        Product two = new Product("Television", 1099.00, 202);
        Product three = new Product("Cellphone", 200.00, 303);
        Product four = new Product("PC", 699.99, 101);
        Set<Product> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four); //Duplicate elements will not be added
        set.add(null); //Allow a null element
        set.add(null); //Duplicate elements will not be added
        for (Product p : set) {
            System.out.println(p);
        }
    }
}

/*
null
101 Laptop
202 Television
303 Cellphone
*/