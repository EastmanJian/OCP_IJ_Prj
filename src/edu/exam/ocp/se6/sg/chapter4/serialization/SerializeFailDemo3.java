package edu.exam.ocp.se6.sg.chapter4.serialization;

import java.io.*;

public class SerializeFailDemo3 implements Serializable {
    private NonSerializedObj o = new NonSerializedObj();


    public static void main(String[] args) {
        try {
            File contactsFile = new File("mycontacts.ser");
            FileOutputStream fos = new FileOutputStream(contactsFile);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            SerializeFailDemo3 sfd = new SerializeFailDemo3();
            out.writeObject(sfd);
            out.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}