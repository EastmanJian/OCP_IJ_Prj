package edu.exam.ocp.se6.sg.chapter3.switchcase;

public class UnboxSwitch {
    public static void main(String[] args) {
        Character value = 'C';
        switch (value) {  //The wrapped Character value is unboxed to a char by the JVM
            case 'A':
            case 'B':
                System.out.println("Nice job!");
                break;
            case 'C':
                System.out.println("Not bad.");
                break;
            default:
                System.out.println("Not good.");
        }
    }
}

/* ->
Not bad.
*/