/*
* LetterGradeLandsman class
*
*
*
* Author: Josh Landsman
*/

// Imports
import java.util.Scanner;


public class LetterGradeLandsman {
    public static void main(String[] args) {

        // Variables
        Scanner s = new Scanner(System.in);
        double grade;

        // Default letter grade if user inputs fake grade
        String letterGrade = "error";

        // Gets user input of letter grade
        System.out.print("What is your grade percentage? ");
        grade = s.nextDouble();


        // Determines letter grade
        if (grade >= 97.0 && grade <= 100.0)
            letterGrade = "A+";
        if (grade >= 93.0 && grade <= 96.99)
            letterGrade = "A";
        if (grade >= 90.0 && grade <= 92.99)
            letterGrade = "A-";
        if (grade >= 87.0 && grade <= 89.99)
            letterGrade = "B+";
        if (grade >= 83.0 && grade <= 86.99)
            letterGrade = "B";
        if (grade >= 80.0 && grade <= 82.99)
            letterGrade = "B-";
        if (grade >= 77.0 && grade <= 79.99)
            letterGrade = "C+";
        if (grade >= 73.0 && grade <= 76.99)
            letterGrade = "C";
        if (grade >= 70.0 && grade <= 72.99)
            letterGrade = "C-";
        if (grade >= 67.0 && grade <= 69.99)
            letterGrade = "D+";
        if (grade >= 63.0 && grade <= 66.99)
            letterGrade = "D";
        if (grade >= 60.0 && grade <= 62.99)
            letterGrade = "D-";
        if (grade >= 0.0 && grade <= 59.99)
            letterGrade = "F";

        // prints out letter grade
        System.out.println("Your grade is a(n) " + letterGrade);

    } // main()
} // LetterGradeLandsman class
