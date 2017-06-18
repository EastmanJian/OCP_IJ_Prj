package edu.exam.ocp.se6.sg.chapter7.arrays.search;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Example of using Comparator in Arrays.binarySearch(...）
 */
public class ProductArraySearch {
    static class DescriptionSorter implements Comparator<Product> {
        public int compare(Product a, Product b) {
            return a.description.compareTo(b.description);
        }
    }

    public static void main(String[] args) {
        Product toFind = new Product("milk", 2.95, 111);
        Product[] products = {
                toFind,
                new Product("eggs", 4.00, 222),
                new Product("butter", 2.75, 333),
                new Product("bread", 1.95, 444)
        };
        DescriptionSorter dc = new DescriptionSorter();
        Arrays.<Product>sort(products, dc);
        for (Product p : products) {
            System.out.println(p.description + " " + p.price);
        }
        int index = Arrays.<Product>binarySearch(products, toFind, dc);
        System.out.println("Index of milk is " + index);
    }
}

/* ->
bread 1.95
butter 2.75
eggs 4.0
milk 2.95
Index of milk is 3
*/
