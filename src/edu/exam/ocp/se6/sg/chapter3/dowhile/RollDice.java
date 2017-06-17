package edu.exam.ocp.se6.sg.chapter3.dowhile;

public class RollDice {
    public static int rollDice() {
        return ((int) (Math.random() * 6)) + 1;
    }

    public static void main(String[] args) {
        int one = 0, two = 0;
        System.out.print("You rolled a ");
        do {
            one = rollDice();
            two = rollDice();
            System.out.print(one + two + " ");
        } while (one + two != 11);
    }
}

/* sample output ->
You rolled a 2 5 10 4 3 7 5 11
*/