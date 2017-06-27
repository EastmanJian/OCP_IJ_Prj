package edu.exam.ocp.se6.sg.chapter2.enumeration;

public class EnumConstructor {
    public static void main(String[] a) {
        //call our enum using the values method
        for (Temp t : Temp.values())
            System.out.println(t + " is : " + t.getValue());
    }

    //make the enum
    public enum Temp {
        absoluteZero(-459), freezing(32),
        boiling(212), paperBurns(451);

        //constructor here
        Temp(int value) {
            this.value = value;
        }

        //regular field?but make it final,
        //since that is the point, to make constants
        private final int value;

        //regular get method
        public int getValue() {
            return value;
        }
    }
}

/* ->
absoluteZero is : -459
freezing is : 32
boiling is : 212
paperBurns is : 451
*/