package edu.exam.ocp.se6.sg.chapter2.array;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] cubics = new double[10];
        for (int i = 0; i < cubics.length; i++) {
            int value = i + 1;
            cubics[i] = value * value * value;
        }
        double[] temp = cubics; //cubics and temp references are of the same type, can be assigned to each other.
        temp[5] = -1; //alter he array's member using the array reference, the array is changed.
        System.out.println(cubics[5]);
        cubics = null;
        for (double a : temp) {
            System.out.print(a + " ");
        }
        temp = new double[20];  //the original array object becomes eligible for garbage collection.
    }
}

/* ->
-1.0
1.0 8.0 27.0 64.0 125.0 -1.0 343.0 512.0 729.0 1000.0
*/