/* OneToTen class
 * 
 * This class alerts the user if they have entered an even number 1 through 10, an odd number 1 through 10, or a
 * number completely outside that range.
 * 
 * Author: Josh Landsman
 */

import java.util.Scanner;

class OneToTen
{
    public static void main(String[] args)
    {
        // create an instance of the Scanner class
        Scanner scan = new Scanner(System.in);

        // prompt the user for an int input and accept it
        System.out.println("Please enter an int: ");
        int num = scan.nextInt();

        // number 1 through 10
        if (num >= 1 && num <= 10) {
            System.out.println("Number is from 1 to 10.");
            if (num % 2 == 0)
                // even number
                System.out.println("Number is even.");
            else
                // odd number
                System.out.println("Number is odd.");
        }
        // number outside 1 to 10
        else
            System.out.println("Number is not from 1 to 10.");

    } // main()

} // OneToTen class