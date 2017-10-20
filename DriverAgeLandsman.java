/*
* DriverAgeLandsman class
*
* Prints out whether or not a user
* is old enough to get their learner's permit
* based on user input
*
* Author: Josh Landsman
*/

// Imports
import java.util.Scanner;

public class DriverAgeLandsman {
    public static void main(String[] args) {

        // Variables
        Scanner s = new Scanner(System.in);
        String name;
        int age;

        // Prompts
        System.out.print("What is your name? ");
        name = s.nextLine();
        System.out.print("Hello " + name + ". What is your age? ");
        age = s.nextInt();

        // Determines if user if old enough for permit
        if (age < 16)
            System.out.println("You are not old enough for your learner's permit!");
        if (age >= 16)
            System.out.println("You are old enough for your learner's permit!");

    } // main()
} // DriverAgeLandsman class
