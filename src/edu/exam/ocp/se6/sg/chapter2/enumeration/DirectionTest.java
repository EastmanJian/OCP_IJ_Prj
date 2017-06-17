package edu.exam.ocp.se6.sg.chapter2.enumeration;

/**
 * Example of enum
 */
public class DirectionTest {
    public static void main(String[] args) {
        for(Direction d : Direction.values()) {
            System.out.print(d.toString() + " ");
        }

        for(Direction d : Direction.values()) {
            System.out.print(d.ordinal() + " ");
        }

        Direction home = Direction.valueOf("SOUTH");
        System.out.println("Heading " + home);
        Direction nowhere = Direction.valueOf("NORTHWEST");
        System.out.println("Going " + nowhere);
    }
}

/* ->
north south east west 0 1 2 3 Heading SOUTH //if the toString() is not overridden in the enum, it should output NORTH SOUTH EAST WEST ...
IllegalArgumentException: No enum constant Direction.NORTHWEST
*/