package edu.exam.ocp.se6.sg.chapter7.generic.interfaces;

public class Dish<U> implements Breakable<U> {
    public void doBreak(U u) {
        System.out.println("Breaking " + u.toString());
    }

    public static void main(String[] args) {
        Dish<Float> dish = new Dish<Float>();
        dish.doBreak(2.7F);
    }
}

/*
Can also use T as the generic type name.

output:
Breaking 2.7

 */