package edu.exam.ocp.se6.sg.chapter2.enumeration;

/**
 * We can loop over the values we put into the enum using the values() method.
 * Note that the enum Seasons is compiled into a separate unit, called EnumDemo$Seasons.class
*/
public class EnumDemo {

   /**
    * declare the enum and add values to it. note that, like in C#, we don't use a ; to end this statement
    * and we use commas to separate the values
    * */
    private enum Seasons {
        WINTER, SPRING, SUMMER, FALL
    }

    /** list the values */
    public static void main(String[] args) {
        for (Seasons s : Seasons.values()){
            System.out.println(s);
        }

    }
}

/* ->
WINTER
SPRING
SUMMER
FALL
*/