package edu.exam.ocp.se6.sg.chapter4.file;

/**
 * Example of FileReader, BufferedReader
 * (set the working path to the states.txt folder path before run this class)
 */
import java.io.*;
public class States {
    public static void main(String [] args) {
        try {
            FileReader fileReader = new FileReader("states.txt");
            BufferedReader in = new BufferedReader(fileReader);
            String currentState = in.readLine();
            while(currentState != null) {
                System.out.println("State: " + currentState);
                currentState = in.readLine();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

/* ->
State: New York
State: Alabama
State: South Dakota
State: Nevada
State: 广州
*/