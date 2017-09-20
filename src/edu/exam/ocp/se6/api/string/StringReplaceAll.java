package edu.exam.ocp.se6.api.string;

public class StringReplaceAll {
    public static void main(String[] args) {
        String sentence = "I like to eat apple.";
        String replaced = sentence.replaceAll("apple", "banana");
        System.out.println(sentence); // -> I like to eat apple.
        System.out.println(replaced); // -> I like to eat banana.
    }
}
