package edu.exam.ocp.se6.sg.chapter3.exception;

public class ExceptionCatchDemo {
    public void method1() {
        System.out.println("Inside method1");
        method2();
    }
    public void method2() {
        System.out.println("Inside method2");
        method3();
    }
    public void method3() {
        System.out.println("Inside method3");
        int x = 5, y = 0;
        try {
            int z = x/y; //throws an ArithmeticException
            System.out.println("z = " + z);
        }catch(ArithmeticException e) {
            System.out.println("Something went wrong: "
            + e.getMessage());
        }
    }    public static void main(String [] args) {
        System.out.println("Inside main");
        new ExceptionCatchDemo().method1();
        System.out.println("End of main");
    }
}

/*
Inside main
Inside method1
Inside method2
Inside method3
Something went wrong: / by zero
End of main
*/
