package edu.exam.ocp.se6.sg.chapter2.nested.member;

/**
 * Example of Member Inner class
 */
public class Outer {
    private String greeting;

    protected class Inner {
        private int repeat = 3;

        public void go() {
            for (int i = 1; i <= repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void displayGreeting() {
        Inner x = this.new Inner(); // can be simplified as 'Inner x = new Inner();', but it's more readable.
        x.repeat = 2;
        x.go();
    }

    public static void main(String[] args) {
        Outer y = new Outer();
        y.greeting = "Hello, Outer";
        y.displayGreeting();
    }
}

/* ->
Hello, Outer
Hello, Outer
*/