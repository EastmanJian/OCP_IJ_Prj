package edu.exam.ocp.se6.sg.chapter3.switchcase;

/**
 * The constant_expression is a switch statement cannot be a reference or a primitive variable.
 */
public class MustConstant {
    public static void main(String[] args) {
        Integer x = 0;
        final int a = 1, b = 2, c = 3;
        switch (x) {
            case 0:
            case a:  //Compile Error: constant expression required, if not final
                System.out.println("0 or 1");
                break;
            case b:  //Compile Error: constant expression required, if not final
                System.out.println("2");
            case c:  //Compile Error: constant expression required, if not final
                System.out.println("2 or 3");
                break;
            default:
                System.out.println("default");
        }
        System.out.println("After switch");
    }
}

/* ->
0 or 1
After switch
*/