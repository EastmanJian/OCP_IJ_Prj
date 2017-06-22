package edu.exam.ocp.se6.sg.chapter4.serialization;

import java.io.*;
import java.util.GregorianCalendar;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            File contactsFile = new File("mycontacts.ser");
            FileInputStream fis = new FileInputStream(contactsFile);
            ObjectInputStream in = new ObjectInputStream(fis);
            while (fis.available() > 0) { //reads in objects from file until the stream is empty.
                Object obj = in.readObject();
                if (obj instanceof Contact2) {
                    Contact2 contact = (Contact2) obj;
                    System.out.println(contact);
                    //the city field did not get serialized because it was declared transient.
                    System.out.println("city = " + contact.getCity());
                }
            }
            in.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }
}

/* ->
Bugs Bunny 22 2025551212
city = null
Daffy Duck 33 3035551212
city = null
*/
