//  Joseph Benson     06 Sept 2019
//  M01 Programming Assignment - Exercise 2.13  (Liang p71)
//  Financial application: compound value

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  Declarations
        final double ANNUAL_INTEREST_RATE = 0.050;
        double monthlyInterestRate;
        double monthlyInterestRateMultiplier;
        double monthlySavings;
        double totalSavings;
        Scanner input = new Scanner(System.in);  //  Creates Scanner object

        //  Initialize
        monthlyInterestRate = ANNUAL_INTEREST_RATE/12;
        monthlyInterestRateMultiplier = monthlyInterestRate + 1;  // Using the multiplier simplifies the monthly savings calculation
        totalSavings = 0.00;
        System.out.print("Enter how much you will be saving each month: ");  //  Prompt user for input of monthly savings
        monthlySavings = input.nextDouble();

        //  Computes monthly savings
        //  New Total Monthly Savings = ( Previous Total Monthly Savings + Monthly Savings) x Monthly Interest Multiplier
        totalSavings = (totalSavings + monthlySavings) * monthlyInterestRateMultiplier;  // After 1 month
        System.out.println("     At the end of 1 month: $" + totalSavings);
        totalSavings = (totalSavings + monthlySavings) * monthlyInterestRateMultiplier;  // After 2 months
        System.out.println("     At the end of 2 month: $" + totalSavings);
        totalSavings = (totalSavings + monthlySavings) * monthlyInterestRateMultiplier;  // After 3 months
        System.out.println("     At the end of 3 month: $" + totalSavings);
        totalSavings = (totalSavings + monthlySavings) * monthlyInterestRateMultiplier;  // After 4 months
        System.out.println("     At the end of 4 month: $" + totalSavings);
        totalSavings = (totalSavings + monthlySavings) * monthlyInterestRateMultiplier;  // After 5 months
        System.out.println("     At the end of 5 month: $" + totalSavings);
        totalSavings = (totalSavings + monthlySavings) * monthlyInterestRateMultiplier;  // After 6 months
        totalSavings = (int)(totalSavings*100) / 100.00;  // Converted into a dollar friendly format

        //  Display savings after 6 months
        System.out.println("At the end of 6 months, by setting aside $" + monthlySavings + " a month at " + (ANNUAL_INTEREST_RATE*100) +
                "% interest, this account has a value of $" + totalSavings);

    }

}