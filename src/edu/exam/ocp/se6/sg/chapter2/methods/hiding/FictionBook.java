package edu.exam.ocp.se6.sg.chapter2.methods.hiding;

/**
 * Example of method hiding
 */
public class FictionBook extends Book {
    public static int getCounter() {
        System.out.println("Inside FictionBook");
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getCounter());
        System.out.println(Book.getCounter());
        System.out.println(FictionBook.getCounter());
    }
}

/* ->
Inside FictionBook
-1
Inside Book
1
Inside FictionBook
-1
*/

/* compile error if remove one of the static keywords of the methods ->
Error: getCounter() in FictionBook cannot override getCounter() in Book overridden method is static
or
Error: getCounter() in FictionBook cannot override getCounter() in Book overriding method is static
*/