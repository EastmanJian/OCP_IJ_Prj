package edu.exam.ocp.se6.sg.chapter1.callbyvalue;

/**
 * When max is done executing, its call-stack memory is freed and a, b, and response all get destroyed.
 * It doesn’t make sense to try to modify response in the go method because response no longer exists in memory.
 */
public class ReturnByValue {
    public static int max(int a, int b) {
        int response;
        if (a < b) {
            response = b;
        } else {
            response = a;
        }
        return response;
    }

    public static void main(String[] args) {
        int x = 20, y = 30;
        int biggest = max(20, 30);
        System.out.println(biggest);
    }
}

/* ->
30
*/
