package edu.exam.ocp.se6.sg.chapter1.callbyvalue;

import java.util.Stack;

/**
 * If the argument passed into a method parameter is a reference type, the same rule applies: it is impossible for a
 * method to alter the original reference. However, because the method now has a reference to the same object that
 * the argument points to, the method can change the object.
 */
 public class StackDemo {
    public static void modifyStacks(Stack<String> one, Stack<Integer> two) {
        two.push(50);
        one.pop();
        one = new Stack<String>();
    } //one is eligible for garbage collection after his line

    public static void main(String[] args) {
        Stack<String> names = new Stack<String>();
        names.push("Kim");
        names.push("Edward");
        names.push("Jane");
        Stack<Integer> grades = new Stack<Integer>();
        grades.push(95);
        grades.push(87);
        modifyStacks(names, grades);
        for (String name : names) {
            System.out.println(name);
        }
        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}

/* ->
Kim
Edward
95
87
50
*/