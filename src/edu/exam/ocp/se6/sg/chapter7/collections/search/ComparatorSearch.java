package edu.exam.ocp.se6.sg.chapter7.collections.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSearch {
    static class ProductComparator implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return (int) (a.price - b.price);
        }
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        Product toFind = new Product("shirt", 29.99, 101);
        list.add(toFind);
        list.add(new Product("shoes", 150.00, 202));
        list.add(new Product("tie", 12.50, 303));
        ProductComparator pc = new ProductComparator();
        Collections.sort(list, pc);
        for (Product p : list) {
            System.out.println(p.description + " " + p.price);
        }
        int index = Collections.binarySearch(list, toFind, pc);
        System.out.println("Index of shirt is " + index);
    }
}

/* ->
tie 12.5
shirt 29.99
shoes 150.0
Index of shirt is 1
*/