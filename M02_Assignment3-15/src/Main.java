//  Programmer:  Joseph Benson
//  Date:  xx xx 2019
//  Program Name:  Game: Lottery (Liang, Exercise 3.15, p111)

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Generate a lottery number
        int lottery = (int) (Math.random() * 1000);

        //  Prompt the user to enter a guess of a 3-digit integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick of three digits (000 to 999): ");
        int guess = input.nextInt();

        //  Get digits from the lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery - (lotteryDigit1 * 100)) / 10;
        int lotteryDigit3 = (lottery - (lotteryDigit1 * 100)) % 10;

        //  Get digits from the lottery
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess - (guessDigit1 * 100)) / 10;
        int guessDigit3 = (guess - (guessDigit1 * 100)) % 10;

        //  Announce the winning numbers
        System.out.println("The winning lottery number is " + lottery + "!");

        //  Compare the guess to the winning number
        if (guess == lottery)
            System.out.println("Exact match:  You win $10,000!");
        else if (  (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
                && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
                && (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
        )
            System.out.println("Matched all digits:  You win $3,000!");
        else if (  guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3)
            System.out.println("Matched one digit:  You win $1,000!");
        else
            System.out.println("Sorry... there were no matching numbers.");
    }
}
