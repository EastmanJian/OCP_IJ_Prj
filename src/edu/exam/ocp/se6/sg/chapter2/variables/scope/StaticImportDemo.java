package edu.exam.ocp.se6.sg.chapter2.variables.scope;

/**
 * Example of static imp
 */
import static edu.exam.ocp.se6.sg.chapter2.variables.scope.House.counter;
import static java.lang.System.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        out.println("counter = " + counter); // the counter here is House.counter introduced by the static imp
        House one = new House();
        House two = new House();
        one.getKitchen();
        two.getKitchen();
        one.getKitchen();
        out.println("counter = " + counter); // the out here is System.out introduced by the static imp
    }
}
