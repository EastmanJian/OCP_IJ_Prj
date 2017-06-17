package edu.exam.ocp.se6.sg.chapter7.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UsingLinkedHashSet {
    public static void main(String[] args) {
        Product one = new Product("Laptop", 1299.99, 101);
        Product two = new Product("Television", 1099.00, 202);
        Product three = new Product("Cellphone", 200.00, 303);
        Product four = new Product("PC", 699.99, 101);

        Set<Product> linkedset = new LinkedHashSet<Product>();
        linkedset.add(two);
        linkedset.add(three);
        linkedset.add(null);
        linkedset.add(two);
        linkedset.add(four);
        linkedset.add(one); //Duplicate elements will not be added
        Iterator<Product> products = linkedset.iterator(); //iterate in the order the elements were inserted.
        while (products.hasNext()) {
            System.out.println(products.next());
        }
    }
}

/* ->
202 Television
303 Cellphone
null
101 PC
*/