/*
* class GuessTheNumberLandsman
*
* This is a simple guessing game program
* Prompts user for playing status to play again or guess again
* Responds to user with correct guess or hints.
*
* Author: Josh Landsman
*/

// Imports
import java.util.Scanner;
import java.lang.Math;

public class GuessTheNumberLandsman {
    public static void main(String[] args) {

        // Variables
        int minNum;
        int maxNum;
        int randomNum;
        int guess;
        int count;
        String playing;
        Scanner s = new Scanner(System.in);

        // Defaults
        minNum = 1;
        maxNum = 1000;
        playing = "Y";
        count = 1;

        // Game
        System.out.println("Welcome to the number guessing game.");

        while (playing.toUpperCase().equals("Y")) {
            // Random number generator
            randomNum = (int)(Math.random() * (maxNum - minNum) + minNum);

            while (playing.toUpperCase().equals("Y")) {

                // Prompts user for guess and responds with higher, lower, or correct
                if (playing.toUpperCase().equals("Y")) {
                    System.out.print("Please guess a number (" + minNum + " - " + maxNum + "): ");
                    guess = s.nextInt();

                    // Guess too high
                    if (guess > randomNum) {
                        System.out.println("Your guess was too high. Guess a lower number.");

                        // Prompt user for playing status
                        System.out.print("Would you like to guess a number? (Y/N): ");
                        playing = s.next();
                    }
                    // Guess too low
                    else if (guess < randomNum) {
                        System.out.println("Your guess was too low. Guess a higher number.");

                        // Prompt user for playing status
                        System.out.print("Would you like to guess a number? (Y/N): ");
                        playing = s.next();
                    }
                    // Guess correct
                    else {
                        System.out.println("You guessed the secret number " + randomNum + "! It took you " + count + " attempts.");
                        playing = "n";
                    }
                }

                // Give up
                else
                    System.out.println("That is unfortunate that you gave up. The secret number was " + randomNum + ".");

                count++;
            } // End of main game while loop

            // Prompts user to play again
            System.out.print("Would you like to play again? (Y/N): ");
            playing = s.next();
        } // End full game while loop

        System.out.println("Goodbye.");

    } // main()
} // class GuessTheNumberLandsman
