package edu.exam.ocp.se6.pe.coding.ex3g;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3g {
    public static void main(String[] args) {
        String s = "a4 0x12 5b _x_ 056 092 0x5g";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println("I found the digital \"" + matcher.group() +
                    "\" starting at index " + matcher.start() +
                    " and ending at index " + matcher.end() + ".");
        }

        pattern = Pattern.compile("\\w");
        matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println("I found the word character \"" + matcher.group() +
                    "\" starting at index " + matcher.start() +
                    " and ending at index " + matcher.end() + ".");
        }

        pattern = Pattern.compile("0x[0-9A-Fa-f]+");
        matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println("I found the hexadecimal \"" + matcher.group() +
                    "\" starting at index " + matcher.start() +
                    " and ending at index " + matcher.end() + ".");
        }

        pattern = Pattern.compile("0[0-7]+");
        matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println("I found the octal \"" + matcher.group() +
                    "\" starting at index " + matcher.start() +
                    " and ending at index " + matcher.end() + ".");
        }

    }
}
/* ->
I found the digital "4" starting at index 1 and ending at index 2.
I found the digital "0" starting at index 3 and ending at index 4.
I found the digital "1" starting at index 5 and ending at index 6.
I found the digital "2" starting at index 6 and ending at index 7.
I found the digital "5" starting at index 8 and ending at index 9.
I found the digital "0" starting at index 15 and ending at index 16.
I found the digital "5" starting at index 16 and ending at index 17.
I found the digital "6" starting at index 17 and ending at index 18.
I found the digital "0" starting at index 19 and ending at index 20.
I found the digital "9" starting at index 20 and ending at index 21.
I found the digital "2" starting at index 21 and ending at index 22.
I found the digital "0" starting at index 23 and ending at index 24.
I found the digital "5" starting at index 25 and ending at index 26.
I found the word character "a" starting at index 0 and ending at index 1.
I found the word character "4" starting at index 1 and ending at index 2.
I found the word character "0" starting at index 3 and ending at index 4.
I found the word character "x" starting at index 4 and ending at index 5.
I found the word character "1" starting at index 5 and ending at index 6.
I found the word character "2" starting at index 6 and ending at index 7.
I found the word character "5" starting at index 8 and ending at index 9.
I found the word character "b" starting at index 9 and ending at index 10.
I found the word character "_" starting at index 11 and ending at index 12.
I found the word character "x" starting at index 12 and ending at index 13.
I found the word character "_" starting at index 13 and ending at index 14.
I found the word character "0" starting at index 15 and ending at index 16.
I found the word character "5" starting at index 16 and ending at index 17.
I found the word character "6" starting at index 17 and ending at index 18.
I found the word character "0" starting at index 19 and ending at index 20.
I found the word character "9" starting at index 20 and ending at index 21.
I found the word character "2" starting at index 21 and ending at index 22.
I found the word character "0" starting at index 23 and ending at index 24.
I found the word character "x" starting at index 24 and ending at index 25.
I found the word character "5" starting at index 25 and ending at index 26.
I found the word character "g" starting at index 26 and ending at index 27.
I found the hexadecimal "0x12" starting at index 3 and ending at index 7.
I found the hexadecimal "0x5" starting at index 23 and ending at index 26.
I found the octal "056" starting at index 15 and ending at index 18.
*/