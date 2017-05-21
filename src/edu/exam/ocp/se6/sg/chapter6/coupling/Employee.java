package edu.exam.ocp.se6.sg.chapter6.coupling;

/**
 * Bad example of coupling - tight coupling
 * Employee class is tightly coupled to Address because Employee makes multiple accesses to the Address class, directly
 * accessing the street, city, and zip fields of Address.
 * Making changes to Address has a direct effect on Employee. For example, if we need to change the city field
 * in Address from a String to a StringBuffer, the Employee class no longer compiles.
 */
public class Employee {
    private Address home;
    public Employee(String street, String city, int zip) {
        home = new Address();
        home.street = street;
        home.city = city;
        home.zip = zip;
    }
}