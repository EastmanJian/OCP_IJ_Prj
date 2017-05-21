package edu.exam.ocp.se6.sg.chapter6.cohesion;

import edu.exam.ocp.se6.sg.chapter6.coupling.Employee;

/**
 * Good example of cohesion - high cohesion
 *
 * To make Payroll highly cohesive, remove the addNewEmployee method from Payroll and add it to a new class that is
 * related to the tasks of hiring employees. For example, the following HumanResources class seems like a good class
 * to contain such a method.
 */
public class Payroll1 {
    public void computeEmployeePay() {
        System.out.println("Compute pay for employees");
    }
    public void computeEmployeeTaxes() {
        System.out.println("Compute taxes for employees");
    }
}