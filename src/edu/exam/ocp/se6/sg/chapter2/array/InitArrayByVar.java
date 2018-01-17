package edu.exam.ocp.se6.sg.chapter2.array;

public class InitArrayByVar {
    public static void main(String[] args) {
        int n=3; //dynamically define the dimension of the array
        int a[];
        a = new int[n];
        a[0]=23;
        a[1]=58;
        for (int i=0; i<a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

    }
}

/* ->
a[0]=23
a[1]=58
a[2]=0
*/