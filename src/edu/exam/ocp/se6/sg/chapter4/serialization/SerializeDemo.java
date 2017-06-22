package edu.exam.ocp.se6.sg.chapter4.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            GregorianCalendar bday1 = new GregorianCalendar(1950, 3, 21);
            GregorianCalendar bday2 = new GregorianCalendar(1956, 5, 30);
            Contact2 one = new Contact2("Bugs Bunny", 22, 2025551212L, bday1, "Toontown");
            Contact2 two = new Contact2("Daffy Duck", 33, 3035551212L, bday2, "Toontown");
            File contactsFile = new File("mycontacts.ser");
            FileOutputStream fos = new FileOutputStream(contactsFile);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(one);
            out.writeObject(two);
            out.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}