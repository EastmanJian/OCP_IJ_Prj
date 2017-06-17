package edu.exam.ocp.se6.sg.chapter1.gc;

public class GCDemo2 {
    public static void main(String [] args) {
        String one = "Hello";
        String two = one;
        String three = "Goodbye";

        three = null; // "Goodbye" object is eligible for garbage collection.
        System.gc(); // might have caused "Goodbye" to get garbage collected, but that is not guaranteed at all.
        one = null;  //does not cause “Hello ” to become eligible because the reference two points to "Hello" also.
        System.gc();
        two = null; //"Hello" becomes eligible for garbage collection. But we cannot know when the objects are actually garbage collected.
    }
}