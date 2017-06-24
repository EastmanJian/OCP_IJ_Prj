package edu.exam.ocp.se6.sg.chapter4.wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        int x = 357;
        Integer w = new Integer(x);
        int y = w.intValue();
        System.out.println("y=" + y); // -> y=357

        double d = Double.parseDouble("123.4");
        System.out.println("d=" + d); // -> d=123.4

        short s = Short.parseShort("127abc"); // NumberFormatException at runtime. Not like NumberFormat.parse(), the latter returns 127.
        System.out.println("s=" + s);
    }
}
