package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String args[]) {

        // Initialize what we know
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Roll the die game.");

        for (int i = 1; i <= maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }

    }
}
