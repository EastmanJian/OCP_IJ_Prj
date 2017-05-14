package edu.exam.ocp.se6.test;

public class CatchRuntimeException {
    public static void main(String[] args) {
        int a=0;
        int b=3;
        try {
            b = 3/a;
        } catch (ArithmeticException e)
        {
            //e.printStackTrace();
            //System.out.println("");
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }

}
