package edu.exam.ocp.se6.sg.chapter4.serialization;

import java.io.*;

public class SerializeFailDemo2 implements Serializable {
    private NonSerializedObj o;


    public SerializeFailDemo2(NonSerializedObj o) {
        this.o = o;
    }

    public static void main(String[] args) {
        try {
            File contactsFile = new File("mycontacts.ser");
            FileOutputStream fos = new FileOutputStream(contactsFile);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            SerializeFailDemo2 sfd = new SerializeFailDemo2(null);
            out.writeObject(sfd);
            out.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}