package edu.exam.ocp.se6.pe.pe4.q60;

/**
 * The sequence of initialization is as below:
 * 1. Explode static {}: s="sb1 "
 * 2. C3 static {}:
 *    2.1 new C4():
 *       2.1.1: Explode(): s="sb1 e "
 *       2.1.2 C4 {}: s="sb1 e i "
 *       2.1.3 rest of C4() :
 *          2.1.3.1 s="sb1 e i c4 "
 *          2.1.3.2 new Explode(): s="sb1 e i c4 e "
 *    2.2 System.out.print(s)
 */
public class C4 extends Explode {
    C4() {
        s += "c4 ";
        new Explode();
    }
    static {
        new C4();
        System.out.print(s);
    }
    { s += "i "; }
    public static void main(String[] args) { }
}
/* ->
sb1 e i c4 e
*/