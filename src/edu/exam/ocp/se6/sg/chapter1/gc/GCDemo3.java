package edu.exam.ocp.se6.sg.chapter1.gc;

import java.util.Vector;

public class GCDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Vector<Dog> vector = new Vector<Dog>();
        Dog one = new Dog("Snoopy", 10);
        Dog two = new Dog("Lassie", 12);

        vector.add(one);
        vector.add(two);

        one = null; //Snoopy is not eligible yet for garbage collection because the Vector still has a reference to the Snoopy object.
        System.out.println("Calling gc once...");
        System.gc();
        Thread.sleep(500); //adding sleep to give time for GC to work, though it's still not guaranteed.

        vector = null; //Snoopy object becomes eligible for garbage collection.
        System.out.println("Calling gc twice...");
        System.gc();
        Thread.sleep(500);

        two = null; //Lassie object becomes eligible for garbage collection.
        System.out.println("Calling gc again...");
        System.gc();
        Thread.sleep(500);
        System.out.println("End of main...");
    }
}

/* sample output->
Calling gc once...
Calling gc twice...
Snoopy is being garbage collected
Calling gc again...
Lassie is being garbage collected
End of main...
*/