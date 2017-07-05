package edu.exam.ocp.se6.sg.chapter4.string;

public class StringChar {
    public static void main(String[] args) {
        String str;
        char c = 'A';
        Character ch = 'B';
//        str = c; //compile error
//        str = (String)c; //compile error
//        str = (String)ch; //compile error
        str = c + "";
        str = ch.toString();
        c = str.charAt(0);
        System.out.print(c); // -> B
    }
}
