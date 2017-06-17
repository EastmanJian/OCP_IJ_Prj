package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * the finally block still executes before the exception is actually thrown and go is popped off the method call stack.
 */
public class TryFinally {
    public String go() {
        System.out.println("Inside go");
        String message = null;
        try {
            message.toUpperCase();
            System.out.println("End of try");
        } finally {
            System.out.println("Inside finally");
        }
        System.out.println("End of go");
        return message;
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        TryFinally test = new TryFinally();
        System.out.println(test.go());
        System.out.println("End of main");
    }
}

/* ->
Inside main
Inside go
Inside finally
Exception in thread "main" java.lang.NullPointerException
        at edu.exam.ocp.se6.sg.chapter3.exception.TryFinally.go(TryFinally.java:8)
        at edu.exam.ocp.se6.sg.chapter3.exception.TryFinally.main(TryFinally.java:20)
*/