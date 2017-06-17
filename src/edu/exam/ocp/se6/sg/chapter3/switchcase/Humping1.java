package edu.exam.ocp.se6.sg.chapter3.switchcase;

public class Humping1 {
    public static void main(String[] args) {
        String r = "-";
        char[] c = {'a', 'b', 'c', 'z'};
        for (char c1 : c)
            switch (c1) {
                default:
                    r += "X";
                case 'a':
                    r += "a";
                case 'b':
                    r += "b";
                    break;
                case 'z':
                    r += "z";
            }
        System.out.println(r);
    }
}

/* ->
-abbXabz
*/

