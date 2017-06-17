package edu.exam.ocp.se6.sg.chapter3.breakloop;

public class OptionalLabel {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        myloop : while(count <= 100) {
            sum += count++;
            if(sum > 10) {
                break myloop;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }
}

/* ->
sum = 15
count = 6
*/