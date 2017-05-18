package edu.exam.ocp.se6.sg.chapter7.generic.classes;

public class Cupboard<T> {
    private T item;

    public Cupboard(T item) {
        System.out.println("Cupboard for " + item.getClass());
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Cupboard<String> c1 = new Cupboard<String>("dishes");
        Cupboard<Integer> c2 = new Cupboard<Integer>(123);
        Cupboard<Double> c3 = new Cupboard<Double>(3.14159);
        String s = c1.getItem();
        Integer x = c2.getItem();
        Double d = c3.getItem();
    }
}

/* output:
Cupboard for class java.lang.String
Cupboard for class java.lang.Integer
Cupboard for class java.lang.Double
*/

