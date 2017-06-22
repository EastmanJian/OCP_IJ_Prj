package edu.exam.ocp.se6.sg.chapter4.io;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class ConsoleReadDemo {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        if(console == null) {
            throw new IOException("Console not available");
        }
        String userprompt = "Enter username:";
        String passprompt = "Password:";
        String verifyprompt = "Verify password:";
        String username = console.readLine("%18s ", userprompt);
        char [] password = console.readPassword("%18s ", passprompt);
        char [] verify = console.readPassword("%18s ", verifyprompt);
        if(password == null || !Arrays.equals(password, verify)) {
            System.out.println("Passwords do not match");
            return;
        }
        if(!Arrays.equals(password, "qwerty123".toCharArray())) {
            System.out.println("Invalid login");
            return;
        }
        System.out.println("Login successful!");

        //Remove password from memory
        for(int i = 0; i < password.length; i++) {
            password[i] = 'x';
            verify[i] = 'x';
        }
    }
}

/*
C:\>java edu.exam.ocp.se6.sg.chapter4.io.ConsoleReadDemo
   Enter username: eastman
         Password:
  Verify password:
Passwords do not match

C:\>java edu.exam.ocp.se6.sg.chapter4.io.ConsoleReadDemo
   Enter username: asdfasdf
         Password:
  Verify password:
Invalid login

C:\>java edu.exam.ocp.se6.sg.chapter4.io.ConsoleReadDemo
   Enter username: aldsjfhsdf
         Password:
  Verify password:
Login successful!
*/
