package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * It's better to use for-each statement to avoid this exception.
 * for(int score : scores ) {
 * total += score;
 }
 */
public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int [] scores = {10, 21, 14, 35};
        int total = 0;
        for(int i = 0; i <= scores.length; i++) { //should use 'i < scores.length' here.
            total += scores[i];
        }
        System.out.println(total);
    }
}

/* ->
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at ArrayIndexOutOfBound.main(ArrayIndexOutOfBound.java:8)
*/
