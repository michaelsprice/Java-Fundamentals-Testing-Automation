package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // 1. Enter an adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();

        // 2. Enter a season of the year
        System.out.println("Enter a season of the year.");
        String season = scanner.next();

        // 3. Enter a whole number
        System.out.println("Enter a whole number.");
        String wholeNumber = scanner.next();
        scanner.close();

        // 4. Display the mad lib
        System.out.println("On a " + adjective + " " + season + " day, I drink a " +
                "minimum of " + wholeNumber + " cups of coffee.");

    }

}
