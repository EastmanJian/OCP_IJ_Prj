package edu.exam.ocp.se6.sg.chapter7.generic.classes;

public class Cupboard<T> {
    private T item;

    public Cupboard(T item) {
        System.out.println("Cupboard for " + item.getClass());
        this.item = item;
    }

    public Cupboard() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Cupboard<String> c1 = new Cupboard<String>("dishes");
        Cupboard<Integer> c2 = new Cupboard<Integer>(123);
        Cupboard<Double> c3 = new Cupboard<Double>(3.14159);
        Cupboard c4 = new Cupboard(); c4.setItem(new Object());
        String s = c1.getItem();
        Integer x = c2.getItem();
        Double d = c3.getItem();
        System.out.println(c4.getItem().getClass());
    }
}

/* output:
Cupboard for class java.lang.String
Cupboard for class java.lang.Integer
Cupboard for class java.lang.Double
class java.lang.Object
*/

