/* DateFormatterLandsman class
 *
 * 	Prompts user for month, day and year as integers
 * 	Converts month number to its String
 * 	Also checks if date entered is valid (isn't completely accurate for check day)
 * 	Then formats the output as "Month Day, Year"
 *
 * Author: Josh Landsman
 */

import java.util.Scanner;

public class DateFormatterLandsman {
    public static void main(String[] args) {

        // Variables
        Scanner s = new Scanner(System.in);
        int day;
        int month;
        String monthString;
        int year;


        // Prompts user for year, month, day
        System.out.print("What year is it? ");
        year = s.nextInt();
        System.out.print("What month is it? ");
        month = s.nextInt();
        System.out.print("What day is it? ");
        day = s.nextInt();

        // month number to word
        switch (month) {
            case 1: monthString = "January";
                    break;
            case 2: monthString = "February";
                    break;
            case 3: monthString = "March";
                    break;
            case 4: monthString = "April";
                    break;
            case 5: monthString = "May";
                    break;
            case 6: monthString = "June";
                    break;
            case 7: monthString = "July";
                    break;
            case 8: monthString = "August";
                    break;
            case 9: monthString = "September";
                    break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        } // switch

        // Prints out properly formatted date
        if (monthString.equals("Invalid month") || (day < 1 || day > 31) || (year < 1))
            System.out.println("The date entered is invalid");
        else
            System.out.println("The date entered is " + monthString + " " + day + ", " + year);

    } // main()
} // DateFormatterLandsman class
