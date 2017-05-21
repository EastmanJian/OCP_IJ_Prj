package edu.exam.ocp.se6.sg.chapter6.coupling;

/**
 * Good example of loose coupling
 */
public class Employee3 {
    private Address2 home;
    public Employee3(String street, String city, int zip) {
        home = new Address2(street, city, zip);
    }
}