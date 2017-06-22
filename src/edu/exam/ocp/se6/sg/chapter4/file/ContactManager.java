package edu.exam.ocp.se6.sg.chapter4.file;

/**
 * Example of DataInputStream, DataOutputStream
 */

import java.io.*;
import java.util.ArrayList;

public class ContactManager {
    public static void addContact(Contact contact, File dest)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(dest, true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream out = new DataOutputStream(bos);
        out.writeUTF(contact.name);
        out.writeInt(contact.age);
        out.writeLong(contact.cellPhone);
        out.close();
        bos.close();
        fos.close();
    }

    public static ArrayList<Contact> getContacts(File source)
            throws IOException {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        FileInputStream fis = new FileInputStream(source);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream in = new DataInputStream(bis);
        while (in.available() > 0) {
            String name = in.readUTF();
            int age = in.readInt();
            long cellPhone = in.readLong();
            Contact current = new Contact(name, age, cellPhone);
            contacts.add(current);
        }
        return contacts;
    }

    public static void main(String[] args) {
        try {
            Contact one = new Contact("Bugs Bunny", 22, 2025551212L);
            Contact two = new Contact("Daffy Duck", 33, 3035551212L);
            File contactsFile = new File("mycontacts.dat");
            addContact(one, contactsFile);
            addContact(two, contactsFile);
            System.out.println(getContacts(contactsFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* ->
[Bugs Bunny 22 2025551212
, Daffy Duck 33 3035551212
]
*/