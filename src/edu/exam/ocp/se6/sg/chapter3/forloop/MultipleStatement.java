package edu.exam.ocp.se6.sg.chapter3.forloop;

public class MultipleStatement {
    public static void main(String[] args) {
        for(int a = 1, b = 10; a < b; a++, b = b - 2) {
            System.out.println(a + b);
        }
    }

}

/* ->
11
10
9
*/