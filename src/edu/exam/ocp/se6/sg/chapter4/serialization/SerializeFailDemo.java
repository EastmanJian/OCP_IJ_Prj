package edu.exam.ocp.se6.sg.chapter4.serialization;

import java.io.*;

public class SerializeFailDemo implements Serializable {
    private NonSerializedObj o;

    public SerializeFailDemo(NonSerializedObj o) {
        this.o = o;
    }

    public static void main(String[] args) {
        try {
            File contactsFile = new File("mycontacts.ser");
            FileOutputStream fos = new FileOutputStream(contactsFile);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            SerializeFailDemo sfd = new SerializeFailDemo(new NonSerializedObj());
            out.writeObject(sfd);
            out.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}