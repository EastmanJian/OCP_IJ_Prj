package edu.exam.ocp.se6.sg.chapter1.operators;

public class AsignmentTest {
    public static void main(String[] args) {
        long m = 1000000000;
        int n = 5;
//        n = n * m; //compiler error, n is promoted to long, hence n * m is long.
        n = (int) (n * m); //Use cast to make the compiler happy. But it's a lossy conversion. Maximum int is 2147483647.
        System.out.println(n); //output 705032704

        m = 1000000000;
        n = 5;
        n *= m; //or using the compound operator avoids the cast. But loss of precision. m is implicitly cast to an int before the multiplication occurs.
        System.out.println(n); //output 705032704

    }

}
