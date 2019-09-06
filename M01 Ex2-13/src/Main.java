//  Joseph Benson     06 Sept 2019
//  M01 Programming Assignment - Exercise 2.13  (Liang p71)
//  Financial application: compound value

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Declarations
        final double ANNUAL_INTEREST_RATE = 0.50;
        double monthlyInterestRate;
        double monthlySavings;
        double monthlySavingsPlusInterest;
        double totalSavings;
        Scanner input = new Scanner(System.in);  //  Creates Scanner object

        //  Initialize
        monthlyInterestRate = ANNUAL_INTEREST_RATE/12
        System.out.print("Enter how much you will be saving each month: ");  //  Prompt user for input of monthly savings
        monthlySavings = input.nextDouble();

        //  Computes monthly savings
        monthlySavingsPlusInterest = monthlySavings + (monthlySavings * monthlyInterestRate)


        //  Displays conversion
        System.out.println(".");

    }

}