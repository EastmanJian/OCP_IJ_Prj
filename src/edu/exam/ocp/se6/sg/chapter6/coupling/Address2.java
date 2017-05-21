package edu.exam.ocp.se6.sg.chapter6.coupling;

/**
 * Good example of loose coupling
 *
 * If the city field of Address is changed from a String to a StringBuffer, no changes need to be made to the Employee2
 * class as long as the signature of setCity is unchanged.
 *
 * One other design technique for achieving loose coupling involves minimizing the interaction between two objects.
 * A better, loosely coupled design is to perform the initialization steps in one method call. Like the constructor
 * Address2(String s, String c, int z) below.
 */
public class Address2 {
    private String street;
    private String city;
    private int zip;

    public void setStreet(String s) {
        street = s;
    }

    public Address2(String s, String c, int z) {
        street = s;
        city = c;
        zip = z;
    }

    public void setCity(String c) {
        city = c;
    }

    public void setZip(int z) {
        zip = z;
    }
}