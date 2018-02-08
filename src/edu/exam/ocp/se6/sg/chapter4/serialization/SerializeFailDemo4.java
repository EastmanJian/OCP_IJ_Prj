package edu.exam.ocp.se6.sg.chapter4.serialization;

import java.io.*;

public class SerializeFailDemo4 implements Serializable {
    private static NonSerializedObj o = new NonSerializedObj();


    public static void main(String[] args) {
        try {
            File contactsFile = new File("mycontacts.ser");
            FileOutputStream fos = new FileOutputStream(contactsFile);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            SerializeFailDemo4 sfd = new SerializeFailDemo4();
            out.writeObject(sfd);
            out.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}