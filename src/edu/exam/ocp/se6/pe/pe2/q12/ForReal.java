package edu.exam.ocp.se6.pe.pe2.q12;

public class ForReal extends TinkerBell {
    public static void main(String[] args) {
        new ForReal().sprinkle();
    }

    public void sprinkle() {
        System.out.println(fly() + " " + dust);
    }
}
/* ->
flying  3
 */