package edu.exam.ocp.se6.sg.chapter6.cohesion;

import edu.exam.ocp.se6.sg.chapter6.coupling.Employee;

/**
 * Good example of cohesion - high cohesion
 */
public class HumanResources {
    public void addNewEmployee(Employee e) {
        System.out.println("New employee hired...");
    }
    public void removeEmployee(Employee e) {
        System.out.println("Employee leaving...");
    }
}