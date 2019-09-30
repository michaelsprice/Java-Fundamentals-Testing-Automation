package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args){
        // Initialize what you know
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", };

        // Get what you don't know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week");
        int dayNumber = scanner.nextInt();
        scanner.close();

        // Output the text
        System.out.println("The day of the week is: " + day[dayNumber - 1]);
    }

    }
