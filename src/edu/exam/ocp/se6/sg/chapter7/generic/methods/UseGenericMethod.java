package edu.exam.ocp.se6.sg.chapter7.generic.methods;

import edu.exam.ocp.se6.sg.chapter7.generic.interfaces.Dish;

import java.util.ArrayList;
import java.util.List;

public class UseGenericMethod {
    public static <U> void wrap(List<Dish<U>> list) {
        for (Dish<U> dish : list) {
            System.out.println("Wrapping " + dish);
        }
    }

    public static void main(String[] args) {
        Dish<String> d1 = new Dish<String>();
        Dish<String> d2 = new Dish<String>();
        Dish<String> d3 = new Dish<String>();
        List<Dish<String>> dishes = new ArrayList<Dish<String>>();
        dishes.add(d1);
        dishes.add(d2);
        dishes.add(d3);
        UseGenericMethod.wrap(dishes);
    }

}
