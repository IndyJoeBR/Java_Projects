//  Programmer: Joseph Benson
//  Date: 04 October 2019
//  Program: M04 Exercise 7.8 (Average an array), Liang 279
//     The program averages an array of 10 numbers - integers and floating point - entered by the user.


import java.util.Scanner;                                   // import Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                 // create a new Scanner object

        int[] intList = new int[10];                            // declare and create integer array
        double[] doubleList = new double[10];                   // declare and create double array

        // Input integer array
        System.out.println("Enter 10 integers: ");              // request integers
        for(int i = 0; i < 10; i++) {                           // loop to take input
            intList[i] = input.nextInt();                       // assigns integer to array
        }

        System.out.println("The average for those 10 integers is: " + average(intList) + ".");      // displays integer average


        // Input double array
        System.out.println("Enter 10 digits with a floating point: ");  // request doubles
        for(int i = 0; i < 10; i++) {                                   // loop to take input
            doubleList[i] = input.nextDouble();                         // assigns double to array
        }

        System.out.println("The average for those 10 integers is: " + average(doubleList) + ".");      // displays double average

    }

    // loaded average method for integers
    public static int average(int[] array) {
        int result = 0;
        for(int i = 0; i < 10; i++) {                                   // loop reads array
            result = result + array[1];                                 // total of integers is created
        }

        result = result / 10;                                           // average of integers is calculated
        return result;                                                  // average of integers is returned
    }

    // loaded average method for doubles
    public static double average(double[] array) {
        double result = 0;
        for(int i = 0; i < 10; i++) {                                   // loop reads array
            result = result + array[1];                                 // total of doubles is created
        }

        result = result / 10;                                           // average of doubles is calculated
        return result;                                                  // average of doubles is returned
    }

}                                                                       // The End
