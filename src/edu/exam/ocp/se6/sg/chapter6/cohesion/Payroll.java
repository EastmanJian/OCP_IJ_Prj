package edu.exam.ocp.se6.sg.chapter6.cohesion;

import edu.exam.ocp.se6.sg.chapter6.coupling.Employee;

/**
 * Bad example of cohesion - low cohesion
 *
 * Adding a new employee to the company seems unrelated to the specific tasks of computing paychecks.
 */
public class Payroll {
    public void computeEmployeePay() {
        System.out.println("Compute pay for employees");
    }
    public void computeEmployeeTaxes() {
        System.out.println("Compute taxes for employees");
    }
    public void addNewEmployee(Employee e) {
        System.out.println("New employee hired...");
    }
}