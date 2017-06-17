package edu.exam.ocp.se6.sg.chapter1.gc;

/**
 * Example of Island of Isolation
 * ref: http://java-questions.com/garbagecollection-interview-questions.html
 */
public class IslandsOfIsolation {
    IslandsOfIsolation g;
    private String name;
    public static void main(String [] str) throws InterruptedException {
        System.out.println("Begin of main()");
        IslandsOfIsolation gc1 = new IslandsOfIsolation("gc1");
        IslandsOfIsolation gc2 = new IslandsOfIsolation("gc2");
        gc1.g = gc2; //gc1 refers to gc2
        gc2.g = gc1; //gc2 refers to gc1
        gc1 = null;
        gc2 = null;
        //gc1 and gc2 refer to each other and have no other valid references
        //gc1 and gc2 form Island of Isolation
        //gc1 and gc2 are eligible for Garbage collection

        System.gc();
        Thread.sleep(500);//wait for the GC to work, though it's not guaranteed.
        System.out.println("End of main()");
    }

    public IslandsOfIsolation(String n) {
        this.name = n;
    }

    public void finalize() {
        System.out.println(name + " is being garbage collected");
    }
}

/* ->
Begin of main()
gc2 is being garbage collected
gc1 is being garbage collected
End of main()
*/