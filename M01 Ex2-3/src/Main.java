//  Joseph Benson     06 Sept 2019
//  M01 Programming Assignment - Exercise 2.3  (Liang p69)
//  Converts feet to meters

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Declarations
        final double FOOT_TO_METERS = 0.305;
        double feet;
        double meters;
        Scanner input = new Scanner(System.in);  //  Creates Scanner object

        //  Prompt user for input
        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();

        //  Computes meters from feet entered
        meters = feet * FOOT_TO_METERS;

        //  Displays conversion
        System.out.println(feet + " feet is " + meters + ".");

    }

}
