package edu.exam.ocp.se6.pe.pe3.q59;

/**
 * If you invoke a .class file without main(), the static initialization blocks will execute before throwing a
 * NoSuchMethodError exception.
 * In command line, run below.
 * java edu.exam.ocp.se6.pe.pe3.q59.Begin
 */
public class Begin {
    static int x;

    { int[] ia2 = {4, 5, 6}; }

    static {
        int[] ia = {1, 2, 3};
        for (int i = 0; i < 3; i++)
            System.out.print(ia[i] + " ");
        x = 7;
        System.out.print(x + " ");
    }
}

/* ->

*/
