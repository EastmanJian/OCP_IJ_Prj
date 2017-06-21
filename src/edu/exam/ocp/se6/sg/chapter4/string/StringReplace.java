package edu.exam.ocp.se6.sg.chapter4.string;

import static java.lang.System.out;

/**
 * String.replace()
 */
public class StringReplace {
    public static void main(String[] args) {
        String s = "Herro";
        String sp = s.replace('r', 'l'); //the replace method instantiate a new String object after replacing the char.
        out.println(s); // -> Herro
        out.println(sp); // -> Hello

    }
}
