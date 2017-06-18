package edu.exam.ocp.se6.sg.chapter7.collections.search;

import java.util.HashSet;
import java.util.Set;

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

}

