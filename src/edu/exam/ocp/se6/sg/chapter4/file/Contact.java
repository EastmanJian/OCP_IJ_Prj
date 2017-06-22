package edu.exam.ocp.se6.sg.chapter4.file;

/**
 * Example of DataInputStream, DataOutputStream
 */
public class Contact {
    public String name;
    public int age;
    public long cellPhone;

    public Contact(String name, int age, long cellPhone) {
        this.name = name;
        this.age = age;
        this.cellPhone = cellPhone;
    }

    public String toString() {
        return name + " " + age + " " + cellPhone + "\n";
    }
}