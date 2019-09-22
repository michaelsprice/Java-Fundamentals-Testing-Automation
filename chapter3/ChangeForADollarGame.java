package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]) {

        // Initialize what we know
        Scanner scanner = new Scanner(System.in);
        double pennyValue = .01;
        double nickelValue = .05;
        double dimeValue = .1;
        double quarterValue = .25;

        // Get what we don't
        System.out.println("How many pennies would you like?");
        double pennies = scanner.nextDouble();
        double pennyAmount = pennies * pennyValue;

        System.out.println("How many nickels would you like?");
        double nickels = scanner.nextDouble();
        double nickelAmount = nickels * nickelValue;

        System.out.println("How many dimes would you like?");
        double dimes = scanner.nextDouble();
        double dimeAmount = dimes * dimeValue;

        System.out.println("How many quarters would you like?");
        double quarters = scanner.nextDouble();
        double quarterAmount = quarters * quarterValue;

        // Find total value
        double total = pennyAmount + nickelAmount + dimeAmount + quarterAmount;

        // Make a decision
        if (total < 1) {
            System.out.println("Sorry, you are short by " + (1 - total) + " cents");
        } else if (total == 1) {
            System.out.println("YOU WON! Your value is $" + total);
        } else {
            System.out.println("Sorry, you are over by " + (total - 1) + " cents");
        }
    }

}
