package edu.exam.ocp.se6.pe.pe2.q11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * It’s okay for Mp3player to implement Serializable even though ElectronicDevice does not. In addition,
 * because Mp3player implements Serializable, its subclass (MiniPlayer) does too. When the MiniPlayer object is
 * deserialized, the only constructor that runs is for the only class that doesn’t implement Serializable or in
 * other words ElectronicDevice.
 */
class MiniPlayer extends Mp3player {
    MiniPlayer() {
        System.out.print("mini ");
    }

    public static void main(String[] args) {
        MiniPlayer m = new MiniPlayer();
        try {
            FileOutputStream fos = new FileOutputStream("dev.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(m);
            os.close();
            FileInputStream fis = new FileInputStream("dev.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            MiniPlayer m2 = (MiniPlayer) is.readObject();
            is.close();
        } catch (Exception x) {
            System.out.print("x ");
        }
    }
}