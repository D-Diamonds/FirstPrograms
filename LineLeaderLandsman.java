/*
* class LineLeaderLandsman
*
* Prompts the user for name (First Last)
* Determines if higher alphabetically
* Loops till user quits loop
* Prints out final leader
*
* Author: Josh Landsman
*/

// Imports
import java.util.Scanner;

public class LineLeaderLandsman {
    public static void main(String[] args) {

        // Variables
        Scanner s = new Scanner(System.in);
        String leader;
        String possible;
        String firstName;
        char lastInitial;
        int space;

        // Defaults
        System.out.print("Please enter a student name (First Last): ");
        leader = s.nextLine();

        // Prompts user for a series of names and compares alphabetically
        while (true) {
            System.out.println("Line leader: " + leader);
            System.out.print("Please enter a student name (First Last)['q' to quit]: ");
            possible = s.nextLine();

            // Quits loop
            if (possible.toLowerCase().equals("q"))
                break;
            // Input is alphabetically higher
            else if (possible.compareTo(leader) < 0)
                leader = possible;
            // Input is alphabetically lower
            else if(possible.compareTo(leader) > 0)
                System.out.print("No change made in leadership. ");
            // Input is alphabetically equal
            else if(possible.compareTo(leader) == 0)
                System.out.print("You entered that name already. ");
        } // while

        space = leader.indexOf(" ");
        firstName = leader.substring(0, space);
        lastInitial = leader.charAt(space + 1);
        System.out.println(firstName + " " + lastInitial + " is the line leader.");
    } // main()
} // class LineLeaderLandsman
