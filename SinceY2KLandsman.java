/*
* SinceY2KLandsman class
*
* Calculates the number	of seconds an input	date
* and time is past the turn	of the millennium on
* January 1, 2000 at midnight.
*
* Author: Josh Landsman
*/

import java.util.Scanner;

public class SinceY2KLandsman {
    public static void main(String[] args) {

    // Variables
        int year;
        int month;
        int day;
        int hour;
        int minute;
        int totalSeconds;
        Scanner s = new Scanner(System.in);
        String timeOfDay;

    // Calculates year to seconds
        System.out.print("What year is it? ");
        year = s.nextInt();
        year = (year - 2000) * 31104000;

    // Calculates month to seconds
        System.out.print("What month is it? ");
        month = s.nextInt();
        month = (month - 1) * 2592000;

    // Calculates day to seconds
        System.out.print("What day is it? ");
        day = s.nextInt();
        day = (day - 1) * 86400;

    // Calculates hour to seconds
        System.out.print("What hour is it? ");
        hour = s.nextInt();
        System.out.print("AM/PM: ");
        timeOfDay = s.next();
        timeOfDay = timeOfDay.toUpperCase();

        // Determines minutes to second conversion based on AM/PM
        if (timeOfDay.equals("AM") && hour != 12) {
            hour = hour * 3600;
        }
        else if (timeOfDay.equals("AM") && hour == 12) {
            hour = 0;
        }
        else if (timeOfDay.equals("PM") && hour != 12) {
            hour = (hour + 12) * 3600;
        }
        else if (timeOfDay.equals("PM") && hour == 12) {
            hour = hour * 3600;
        }

    // Calculates minute to seconds
        System.out.print("What minute is it? ");
        minute = s.nextInt();
        minute = minute * 60;

    // Calculates total seconds since millennium and prints
        totalSeconds = year + month + day + hour + minute;
        System.out.printf("The entered date is %,d seconds past the start of the millennium.\n", totalSeconds);


    } // main()
} // SinceY2KLandsman class
