package edu.exam.ocp.se6.pe.pe3.q48;

public class DogsSplit {
    public static void main(String[] args) {
        String s = "dogs. with words.";

        String[] output;

        output = s.split("s");
        for(String o: output)
            System.out.print(o + " | ");
        System.out.println(" - split by 's'");

        output = s.split("d");
        for(String o: output)
            System.out.print(o + " | ");
        System.out.println(" - split by 'd'");

        output = s.split("\\d");
        for(String o: output)
            System.out.print(o + " | ");
        System.out.println(" - split by '\\\\d'");

        output = s.split("\\s");
        for(String o: output)
            System.out.print(o + " | ");
        System.out.println(" - split by '\\\\s'");

        output = s.split("\\w");
        for(String o: output)
            System.out.print(o + " | ");
        System.out.println(" - split by '\\\\w'");

        output = s.split("\\.");
        for(String o: output)
            System.out.print(o + " | ");
        System.out.println(" - split by '\\\\.'");

    }

}
