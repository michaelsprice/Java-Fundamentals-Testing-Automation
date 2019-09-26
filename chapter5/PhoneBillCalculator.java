package chapter5;

/*
Calculate the final total on someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute that they've gone over, and then a 15% tax on the subtotal.
Create separate methods to calculate the tax, overage fees, and calculate and print the final total.
Print this as an itemized bill.
 */

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overageMinuteFee = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]){
        double planFee = getPlanFee();
        double overageMinutes = getOverageMinutes();
        scanner.close();
        double overageFee = calcOverageFee(overageMinutes);
        double tax = calculateTax(planFee, overageFee);
        double bill = totalBill(planFee, overageFee, tax);
        billPrintout(planFee, overageFee, tax, bill);
    }

        public static double getPlanFee(){
        System.out.println("Enter the plan fee:");
        double planFee = scanner.nextInt();
        return planFee;
    }
        public static double getOverageMinutes(){
        System.out.println("Enter the number of overage minutes:");
        double overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    // Calculate the overage fees
       public static double calcOverageFee(double overageMinutes){
       double overageFee = overageMinutes * overageMinuteFee;
       return overageFee;
        }

    // Calculate the tax
        public static double calculateTax(double planFee, double overageFee){
        double tax = (planFee + overageFee) * taxRate;
        return tax;
        }

    // Calculate the final total
        public static double totalBill(double planFee, double overageFee, double tax){
            double bill = planFee + overageFee + tax;
            return bill;
        }

    // Print the final total
        public static void billPrintout(double planFee, double overageFee, double tax, double bill){
            System.out.println("Phone Bill Statement:");
            System.out.println("Plan: $" + planFee);
            System.out.println("Overage Fee: $" + overageFee);
            System.out.println("Taxes: $" + tax);
            System.out.println("Total: $" + bill);
        }
    }
