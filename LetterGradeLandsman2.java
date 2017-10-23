/*
* LetterGradeLandsman2 class
*
* This program prints out the
* letter grade corresponding
* with a user's inputted percentage
*
* Author: Josh Landsman
*/

// Imports
import java.util.Scanner;


public class LetterGradeLandsman2 {
    public static void main(String[] args) {

        // Variables
        Scanner s = new Scanner(System.in);
        double grade;

        // Default letter grade if user inputs fake grade
        String letterGrade;

        // Gets user input of letter grade
        System.out.print("What is your grade percentage? ");
        grade = s.nextDouble();


        // Determines letter grade
        if (grade > 100.0)
            letterGrade = "false grade";
        else if (grade >= 97.0)
            letterGrade = "A+";
        else if (grade >= 93.0)
            letterGrade = "A";
        else if (grade >= 90.0)
            letterGrade = "A-";
        else if (grade >= 87.0)
            letterGrade = "B+";
        else if (grade >= 83.0)
            letterGrade = "B";
        else if (grade >= 80.0)
            letterGrade = "B-";
        else if (grade >= 77.0)
            letterGrade = "C+";
        else if (grade >= 73.0)
            letterGrade = "C";
        else if (grade >= 70.0)
            letterGrade = "C-";
        else if (grade >= 67.0)
            letterGrade = "D+";
        else if (grade >= 63.0)
            letterGrade = "D";
        else if (grade >= 60.0)
            letterGrade = "D-";
        else if (grade >= 0.0)
            letterGrade = "F";
        else if (grade < 0)
            letterGrade = "false grade";
        else
            letterGrade = "error";

        // prints out letter grade
        System.out.println("Your grade is a(n) " + letterGrade);

    } // main()
} // LetterGradeLandsman2 class
