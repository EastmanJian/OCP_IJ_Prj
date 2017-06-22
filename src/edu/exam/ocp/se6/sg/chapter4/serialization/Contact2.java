package edu.exam.ocp.se6.sg.chapter4.serialization;

/**
 * Example of serialization
 */

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Contact2 implements Serializable {
    private String name; //String implements Serializable.
    private int age;  //all the primitive types are Serializable.
    private long cellPhone;
    private GregorianCalendar birthday; //GregorianCalendar implements Serializable
    private transient String city;

    public Contact2(String name, int age, long cellPhone, GregorianCalendar birthday, String city) {
        this.name = name;
        this.age = age;
        this.cellPhone = cellPhone;
        this.birthday = birthday;
        this.city = city;
    }

    public String toString() {
        return name + " " + age + " " + cellPhone;
    }

    public String getCity() {
        return city;
    }
}