package edu.exam.ocp.se6.sg.chapter3.whileloop;

public class RollDice {
    public static int rollDice() {
        return ((int) (Math.random() * 6)) + 1;
    }
    public static void main(String [] args) {
        int one = rollDice();
        int two = rollDice();
        System.out.print("You rolled a " + (one + two));
        while(one + two != 11) {
            one = rollDice();
            two = rollDice();
            System.out.print(", " + (one + two));
        }
    }
}

/* sample output ->
You rolled a 7, 4, 9, 7, 7, 6, 5, 8, 9, 12, 11
*/