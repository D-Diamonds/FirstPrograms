/*
* BasicStringOutputLandsman class
*
* This program uses multiple for loops
* to print out desired strings
* The first loop prints integers 1-5
* The second 8-digit binary 1-5
* A half pyramid with width sizes increasing w/ each newline (1-5)
* An upside down half pyramid with width sizes decreasing w/ each newline (1-5)
*
* Author: Josh Landsman
*/


public class BasicStringOutputLandsman {
    public static void main(String[] args) {

        System.out.println("I can count to five:");

        /*
        * Problem 1
        * For loop iterating from  1-5
        * prints the number than a space
        */
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        } //Integer print 1-5

        //Prints two new lines for beautification
        System.out.println("");
        System.out.println("");


        /*
        * Problem 2
        * This for loop prints 1-5 in 8-digit binary
        * It first prints the "0"s before the binary number
        * then prints on same line its binary number
        * this makes the number 8 digits (new line)
        */
        System.out.println("I can also count in eight-digit binary:");
        for (int i = 1; i < 6; i++) {
            if (i == 1) {
                System.out.print("0000000");
            } else if (i < 4) {
                System.out.print("000000");
            } else {
                System.out.print("00000");
            }
            System.out.println(Integer.toBinaryString(i));
        } //Binary print 1-5

        System.out.println("");

        /*
        * Problem 3
        * This for loop starts at 1 and iterates up to 5
        * On each iteration it prints an "*" i times
        * and at the end of the iteration prints a new line
        */
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        } //Half pyramid

        System.out.println("");

        // Problem 4
        //This for loop does the opposite of above description
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        } //Upside down half pyramid

    } //main() method
} //class BasicStringOutputLandsman
