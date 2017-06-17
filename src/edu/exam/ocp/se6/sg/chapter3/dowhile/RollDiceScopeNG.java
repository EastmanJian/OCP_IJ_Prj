package edu.exam.ocp.se6.sg.chapter3.dowhile;

/**
 * A variable declared within the block of a do statement only has scope within that block,
 * not including the boolean_expression.
 */
public class RollDiceScopeNG {
    public static int rollDice() {
        return ((int) (Math.random() * 6)) + 1;
    }

    public static void main(String[] args) {
        System.out.print("You rolled a ");
/*
        do {
            int one = rollDice();
            int two = rollDice();
            System.out.print(one + two + " ");
        } while (one + two != 11); //Compile Error: cannot find symbol
*/
    }
}
