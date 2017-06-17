package edu.exam.ocp.se6.sg.chapter1.app;

/**
 * All command-line arguments are treated as String objects.
 * Run this example as: java ParseDemo 34567 false 3.14159 R
 */
public class ParseDemo {
    public static void main(String[] args) {
        System.out.print("Processing " + args.length + " arguments: ");
        for (String s : args) System.out.print(s + " ");
        System.out.println();

        int x = Integer.parseInt(args[0]);
        System.out.println(x);
        boolean b = Boolean.parseBoolean(args[1]);
        System.out.println(b);
        float f = Float.parseFloat(args[2]);
        System.out.println(f);
        char c = args[3].charAt(0);
        System.out.println(c);
    }
}

/* ->
Processing 4 arguments: 34567 false 3.14159 R
34567
false
3.14159
R
*/