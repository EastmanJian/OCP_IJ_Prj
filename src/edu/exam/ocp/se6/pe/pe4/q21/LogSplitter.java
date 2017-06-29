package edu.exam.ocp.se6.pe.pe4.q21;

import java.util.*;

/**
 * The String.split will also produce empty split Strings if the token is at the beginning or there are two continuous
 * tokens, but if the token is at the end, an empty String won't be produced after that.
 * run with following arguments
 * java LogSplitter "x1 23 y #" "\d" "\s" "\w" "x" "#"
 */
public class LogSplitter {
    public static void main(String[] args) {
        System.out.println("String to be split = \"" + args[0] + "\"");
        String[] sp;
        for (int x = 1; x < args.length; x++) {
            sp = args[0].split(args[x]);
            System.out.println("split by " + args[x] + ", number of split strings = " + sp.length);
            System.out.print("|");
            for (String s : sp) System.out.print(s + "|");
            System.out.println();
        }
    }
}

/* ->
String to be split = "x1 23 y #"
split by \d, number of split strings = 4
|x| || y #|
split by \s, number of split strings = 4
|x1|23|y|#|
split by \w, number of split strings = 6
||| || | #|
split by x, number of split strings = 2
||1 23 y #|
split by #, number of split strings = 1
|x1 23 y |
*/