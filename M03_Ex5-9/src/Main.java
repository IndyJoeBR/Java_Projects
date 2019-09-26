//  Programmer: Joseph Benson
//  Class: SDEV 200
//  Assignment: M03 Exercise 5.9, p195
//  Program: Find the two highest scores

//  Note:  The program works great, although it doesn't handle a tie well.  Order or entry is too important.

// RESOURCES
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Declare Variables
        int qtyStudents;                                //  Number of students being entered
        int highScore = 0;                                  //  The highest score at any given time
        String highStudent ="";                             //  The student holding the highest score at any given time
        int secondScore = 0;                                //  The second highest score at any given time
        String secondStudent = "";                           //  The student holding the second highest score at any given time
        int score;                                      //  The score being entered
        String name;                                    //  The name of the student being entered


        //  User enters number of students
        System.out.print("How many student's grades will you be entering: ");
        qtyStudents = input.nextInt();
        System.out.println("You are entering scores for " + qtyStudents + " students.");


        //  Enter loop and review each score for being the highest or second highest
        for (int i = 1; i <= qtyStudents; i = i + 1) {
            System.out.print("Enter the first name of student " + i + ": ");
            name = input.next();
            System.out.print("Enter " + name + "'s score: ");
            score = input.nextInt();


            if (score > highScore) {                                    //  If the entered score is the new high score
                secondScore = highScore;                                //    the old high score becomes the new second high score
                secondStudent = highStudent;                            //    the old high score student becomes the new second high score student
                highScore = score;                                      //    and the new high score and high score student are set
                highStudent = name;
            }
            else if (score > secondScore) {                             //  If the entered score was not the new high score, but beats the old second high score
                secondScore = score;                                    //  the new second high score and second high score student are set
                secondStudent = name;
            }
        }


        //  Displays the results
        System.out.println("The student with the highest score at " + highScore + " is " + highStudent + ".");
        System.out.println("The student with the 2nd highest score at " + secondScore + " is " + secondStudent + ".");


    }
}
