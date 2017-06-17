package edu.exam.ocp.se6.sg.chapter3.ifelse;

/**
 * if statement
 */
public class IfTest {
    public static void main(String[] args) {
        int y = 12;
//        if (y) { //Compile Error: incompatible types: int cannot be converted to boolean
//            System.out.println("This does not work");
//        }

        Boolean b = true;
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }

        //Watch out for assignment statements that look like boolean expressions.
        boolean bl = false;
        if (bl = true) { //Compiles fine. bl = true is an assignment, not a comparison. The result of this boolean assignment is the value of bl after the assignment, which is true.
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

/* ->
b is true
true
 */
